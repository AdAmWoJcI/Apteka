package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    private static final String JDBC_URL = "jdbc:h2:./database/apteka";
    private static final String JDBC_USER = "sa";
    private static final String JDBC_PASSWORD = "";

    public static void main (String[] args){
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
            System.out.println("Połączenie z baza danych zostało nawiązane");
            // przykłaodwy kod do utowrzenia tabeli 
            String createTableSQL = "CREATE TABLE IF NOT EXISITS LEKI("+
            "ID INT AUTO_INCREMENT PRIMARY KEY)";
            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Tabela zostałą utworzona");

        } catch (Exception e) {
            e.printStackTrace();        }
    }
}
