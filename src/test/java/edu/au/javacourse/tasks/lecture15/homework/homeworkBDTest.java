package edu.au.javacourse.tasks.lecture15.homework;

import edu.au.javacourse.tasks.lecture15.JDBCStudentHelper;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class homeworkBDTest {
    @Test
    void transactionTest() throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:javacourse;INIT=RUNSCRIPT FROM 'classpath:javacourse_init.sql'");
        try(Connection conn = ds.getConnection()) {
            conn.setAutoCommit(false);
            JDBCStudentHelper.listAllStudents(conn, "Начальный список:");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO student(id, first_name, last_name, age) VALUES (7 ,'Арина', 'Смирнова', 20)");
            conn.commit();
            JDBCStudentHelper.listAllStudents(conn, "После commit:");
            Statement st1 = conn.createStatement();
            st1.executeUpdate("INSERT INTO student(id, first_name, last_name, age) VALUES (8 ,'Антон', 'Сидоров', 12)");
            conn.rollback();
            JDBCStudentHelper.listAllStudents(conn, "После rollback:");
        }
    }
}
