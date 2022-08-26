package util;

import java.sql.SQLException;

public class ExceptionHandler {

    private ExceptionHandler() {
        throw new IllegalStateException("Utility class");
    }

    public static void handleException(Exception exception) {
        if (exception instanceof SQLException sqlException) {
            System.out.println("Error Code: " + sqlException.getErrorCode());
            System.out.println("SQL State: " + sqlException.getSQLState());
        }
        System.out.println("SQLException message: " + exception.getMessage());
        System.out.print("Stacktrace: ");
        exception.printStackTrace();
    }
}
