package com.site;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/StudentDB";
        String username = "root";
        String password = System.getenv("DB_PASSWORD");

        try {

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println("Database connected successfully!");

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}