package com.pluralsight.corejdbc.m3c3;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ProductsComponentJNDI {

    public boolean getProductCount() throws Exception {

        InitialContext ctx = new InitialContext();

        DataSource dataSource = (DataSource) ctx.lookup("jdbc/mysql");

        try (Connection connection = dataSource.getConnection("genius", "abracadabra")) {
            return connection.isValid(2);
        }

    }
}
