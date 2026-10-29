package Ducat.ducat.JDBC_PREPAREST;

import java.sql.SQLException;
import java.util.List;

import Ducat.ducat.JDBC.Student;

public interface studentdao {

    public void insertStudent(student s) throws SQLException;

    public void updateStudent(student s) throws SQLException;

    public void deleteStudent(int id) throws SQLException;

    public void getStudentByid(int id) throws SQLException;

    public void getStudentByName(String name) throws SQLException;

    public void printAllStudents() throws SQLException;

    public List<student> getAllStudents() throws SQLException; // Return a list of Student objects

}
