package Ducat.ducat.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        // -------------Approach 1--------------------------------------------------
        // // Java application aur database ke beech connection establish karta hai.
        // Connection conn =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jatin", "root",
        // "root");

        // // SQL queries ko database par execute karne ke liye object create karta hai.
        // Statement st = conn.createStatement();

        // // Database me data insert, update ya delete karne ke liye use hota hai.
        // st.executeUpdate("INSERT INTO STUDENT
        // VALUES(9,'testJATIN','testJATIN@GMAIL.COM','MALE',32)");

        // -------------Approach 2--------------------------------------------------
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jatin",
        // "root","root").createStatement().executeUpdate("INSERT INTO STUDENT
        // VALUES(10,'jdbc','jdbc@GMAIL.COM','MALE',30)");

        Student stu1 = new Student();
        stu1.setSno(12);
        stu1.setName("JatinTest");
        stu1.setEmail("Random@gmnail.com13");
        stu1.setGender("Male");
        stu1.setAge(27);

        StudentDao dao = new StudentDaoImpl();
        // dao.saveStudent(stu1);
        // dao.updateStudent(stu1);
        // dao.deleteStudent(12);
        // dao.getStudentById(10);
        // dao.getAllStudent();
        // dao.getStudentById(10);
        dao.getStudentByname("testJATIN");

        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }

    }
}