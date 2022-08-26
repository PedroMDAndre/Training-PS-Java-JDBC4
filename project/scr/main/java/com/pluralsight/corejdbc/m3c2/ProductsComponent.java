package com.pluralsight.corejdbc.m3c2;

import java.sql.DriverManager;
import java.sql.Connection;

import static com.pluralsight.corejdbc.common.ConstantProperties.DB_URL;

public class ProductsComponent {

    public boolean tryConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            return connection.isValid(2);
        }
    }
}