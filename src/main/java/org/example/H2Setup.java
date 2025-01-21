package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Setup {
    private static final String JDBC_URL = "jdbc:h2:/database/apteka";
    private static final String JDBC_USER = "sa";
    private static final String JDBC_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("Połączenie z bazą danych H2 działa poprawnie!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
