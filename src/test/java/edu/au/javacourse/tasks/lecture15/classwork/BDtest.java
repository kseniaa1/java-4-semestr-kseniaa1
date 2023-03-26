package edu.au.javacourse.tasks.lecture15.classwork;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDtest {
    @Test
    void bdTest() throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:javacourse;INIT=RUNSCRIPT FROM 'classpath:javacourse_init.sql'");
        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery("select * from student where age > 21");
            while (result.next()) {
                System.out.println(result.getString("id") + " " + result.getString("first_name") + " " + result.getString("last_name") + " " + result.getString("age"));
            }
        }
    }
}
