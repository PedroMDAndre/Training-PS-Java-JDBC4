package com.pluralsight.corejdbc.m3c1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.pluralsight.corejdbc.common.ConstantProperties.DB_URL;

public class ProductsComponent {

    public boolean tryConnection() throws SQLException {
        try (
                Connection connection = DriverManager.getConnection(DB_URL)
        ) {
            return connection.isValid(2);
        }
    }

}

