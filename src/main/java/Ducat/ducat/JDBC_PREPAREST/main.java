package Ducat.ducat.JDBC_PREPAREST;

import java.sql.SQLException;
import java.util.List;

import Ducat.ducat.JDBC.Student;

public class main {

    public static void main(String[] args) throws SQLException {

        student s = new student();
        s.setId(2);
        s.setName("kavita");
        s.setEmail("kavita@example.com");
        s.setGender("female");

        studentdao dao = new studentDaoImpl();
        // dao.insertStudent(s);
        // dao.updateStudent(s);
        // dao.deleteStudent(2);
        // dao.getStudentByid(1);
        // dao.getStudentByName("john");
        // dao.printAllStudents();
        List<student> students = dao.getAllStudents();
        for (student student : students) {
            System.out.println(student);
        }

    }

}
