package com.pluralsight.corejdbc.m2c1;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.pluralsight.corejdbc.common.ConstantProperties.DB_URL;

public class ConnectComponent {

    public boolean tryConnection() throws Exception {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            return conn.isValid(2);
        }
    }

}
