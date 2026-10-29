package Ducat.ducat.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    public static final String INSERT_QUERY = "INSERT INTO STUDENT VALUES('%d', '%s','%s','%s', '%d')";
    public static final String UPDATE_QUERY = "UPDATE STUDENT SET NAME = '%s', AGE='%d' WHERE SNO='%d'";
    public static final String DELETE_QUERY = "DELETE FROM STUDENT WHERE SNO ='%d'";
    public static final String SELECT_QUERY = "SELECT * FROM STUDENT"; // used for getting the student by
    public static final String SELECT_BY_ID = "SELECT * FROM STUDENT WHERE SNO='%d'";// used for getting the student by
                                                                                     // id
    public static final String SELECT_ALL_QUERY = "SELECT * FROM STUDENT"; // used for getting all the students.
    public static final String SELECT_BY_NAME = "SELECT * FROM STUDENT WHERE NAME ='%s'"; // used for getting the
                                                                                          // student by name

    static Connection conn; // declared at class level so that every override method can use it.

    // static block used so that can use directly instead of creating the object.
    static {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jatin", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteStudent(int id) throws SQLException {

        Statement statement = conn.createStatement();
        statement.executeUpdate(String.format(DELETE_QUERY, id));
        statement.close(); // closing the statement object. it is good practice to close the statement
                           // object after use. it is not mandatory but it is a good practice.
        System.err.println(String.format(DELETE_QUERY, id));

    }

    @Override
    public void getAllStudent() throws SQLException {

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(SELECT_QUERY); // executeQuery() returns the result set. It is used for
                                                             // select statement
        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " +
                            rs.getString(4) + " "
                            + rs.getInt(5));
            // another way of printing the data
            // System.out.println("SNO=" + rs.getInt(1) + "\tName=" + rs.getString(2) +
            // "\tEmail=" + rs.getString(3)
            // + "\tGender=" + rs.getString(4) + "\tAge=" + rs.getInt(5) + "\n");

        }
    }

    @Override
    public void getStudentById(int id) throws SQLException {

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(String.format(SELECT_BY_ID, id));
        if (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " +
                    rs.getString(4) + " "
                    + rs.getInt(5));
        } else {
            System.out.println("No student found with id " + id); // if no student found with id then it will print this
                                                                  // message. it is a good practice to
                                                                  // handle the exception. it is not mandatory
        }

    }

    @Override
    public void saveStudent(Student s) throws SQLException {

        Statement statement = conn.createStatement();
        statement.executeUpdate(String.format(INSERT_QUERY, s.getSno(), s.getName(),
                s.getEmail(), s.getGender(), s.getAge()));
        statement.close();
        // -----------------format of writing String data--------------------
        // System.out.println(String.format("SNO='%d',Name='%s', Email='%s', Gender=%s,
        // Age='%d'", s.getSno(), s.getName(),
        // s.getEmail(), s.getGender(), s.getAge()));

        System.err.println(String.format(INSERT_QUERY, s.getSno(), s.getName(),
                s.getEmail(), s.getGender(), s.getAge()));

    }

    @Override
    public void updateStudent(Student s) throws SQLException {

        Statement statement = conn.createStatement();
        statement.executeUpdate(String.format(UPDATE_QUERY, s.getName(), s.getAge(), s.getSno()));
        statement.close();
        System.err.println(String.format(UPDATE_QUERY, s.getName(), s.getAge(), s.getSno()));

    }

    @Override
    public void getStudentByname(String name) throws SQLException {

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(String.format(SELECT_BY_NAME, name));
        if (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
                    + " " + rs.getInt(5));

        } else {
            System.out.println("No student found with id " + name);
        }

    }

    @Override
    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(SELECT_ALL_QUERY);
        while (rs.next()) {
            Student s = new Student();
            s.setSno(rs.getInt("SNO"));
            s.setName(rs.getString("NAME"));
            s.setEmail(rs.getString("EMAIL"));
            s.setGender(rs.getString("GENDER"));
            s.setAge(rs.getInt("AGE"));
            students.add(s); // adding the student to the list. it is a good practice to add the student to
                             // the list
        }
        return students;

    }

}
