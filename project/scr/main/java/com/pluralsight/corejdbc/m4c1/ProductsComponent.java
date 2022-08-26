package com.pluralsight.corejdbc.m4c1;

import java.sql.*;

import static com.pluralsight.corejdbc.common.ConstantProperties.DB_URL;


public class ProductsComponent {

    public void printProductList() throws SQLException {

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

            while (resultSet.next()) {
                String name = resultSet.getString("productName");
                System.out.println(name);
            }

            resultSet.close();
        }

    }
}
