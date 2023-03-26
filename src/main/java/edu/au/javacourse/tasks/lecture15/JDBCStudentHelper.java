package edu.au.javacourse.tasks.lecture15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStudentHelper {
    public static void listAllStudents(Connection conn, String title) {
        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery("SELECT id, first_name, last_name, age FROM student");
            System.out.println("-----------------------");
            System.out.println(title);
            System.out.println("-----------------------");
            while (result.next()) {
                System.out.println(result.getString("id") + " " + result.getString("first_name") + " " + result.getString("last_name") + " " + result.getString("age"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
