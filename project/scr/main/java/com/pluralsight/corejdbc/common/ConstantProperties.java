package com.pluralsight.corejdbc.common;

public class ConstantProperties {

    private ConstantProperties() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * DRIVER = "mysql"<br>
     * HOST = "//localhost:3306"<br>
     * USERNAME = "root"<br>
     * PASSWORD = "root"<br>
     */
    public static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels?user=root&password=root&serverTimezone=UTC";
}
