package com.pluralsight.corejdbc.m3c3;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

public class ProductsComponentCDI {

    @Inject
    @MySqlDataSource
    DataSource dataSource;

    public boolean getProductCount() throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            return connection.isValid(2);
        }
    }
}
