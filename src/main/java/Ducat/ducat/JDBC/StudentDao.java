package Ducat.ducat.JDBC;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    // Dao means data access object layer. Dao me sirf wo classes hoti hai jisme
    // database related logic likha jata hai.

    public void saveStudent(Student s) throws SQLException;

    public void updateStudent(Student s) throws SQLException;

    public void deleteStudent(int id) throws SQLException;

    public void getStudentById(int id) throws SQLException;

    public void getStudentByname(String name) throws SQLException;

    public void getAllStudent() throws SQLException;

    public List<Student> getAllStudents() throws SQLException; // List<Student> means list of students. It is a
                                                               // collection of students. It is a collection of objects.

}
