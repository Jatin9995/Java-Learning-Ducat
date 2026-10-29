package Ducat.ducat.JDBC_PREPAREST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Ducat.ducat.JDBC.Student;

//PreparedStatement mein query pehle ready hoti hai aur baad mein values daali jaati hain.

public class studentDaoImpl implements studentdao {

    static Connection conn;

    static {

        try {
            // getConnection() → Database se connect karta hai.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static final String INSERT_STUDENT = "INSERT INTO STUDENT VALUES (?, ?, ?, ?)";
    public static final String UPDATE_STUDENT = "UPDATE STUDENT SET name = ?, gender=?,email = ? WHERE id = ?";
    public static final String DELETE_STUDENT = "DELETE FROM STUDENT WHERE id = ?"; // DELETE query mein ? me id daalte
    public static final String GET_STUDENT_BY_ID = "SELECT * FROM STUDENT WHERE id = ?";
    public static final String GET_STUDENT_BY_NAME = "SELECT * FROM STUDENT WHERE name = ?";
    public static final String PRINT_ALL_STUDENTS = "SELECT * FROM STUDENT"; // SELECT query mein ? me id daalte
    public static final String GET_ALL_STUDENTS = "SELECT * FROM STUDENT";

    @Override
    public void insertStudent(student s) throws SQLException {
        // prepareStatement() → Query ko ready karta hai.
        PreparedStatement ps = conn.prepareStatement(INSERT_STUDENT);

        // setInt(), setString() → ? me values daalte hain.
        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getEmail());
        ps.setString(4, s.getGender());

        // executeUpdate() → Query chalata hai.
        ps.executeUpdate();
        System.out.println("Student inserted successfully.");
        ps.close(); // close() → Resources free karta hai.

    }

    @Override
    public void updateStudent(student s) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(UPDATE_STUDENT);
        ps.setString(1, s.getName());
        ps.setString(2, s.getGender());
        ps.setString(3, s.getEmail());
        ps.setInt(4, s.getId());
        ps.executeUpdate();
        System.out.println("Student updated successfully.");

    }

    @Override
    public void deleteStudent(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(DELETE_STUDENT);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Student deleted successfully.");
        ps.close(); // close() → Resources free karta hai.

    }

    @Override
    public void getStudentByid(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(GET_STUDENT_BY_ID);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        rs.close(); // close() → Resources free karta hai.
        ps.close(); // close() → Resources free karta hai.

    }

    @Override
    public void getStudentByName(String name) throws SQLException {

        PreparedStatement ps = conn.prepareStatement(GET_STUDENT_BY_NAME);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        rs.close(); // close() → Resources free karta hai.
        ps.close(); // close() → Resources free karta hai.

    }

    @Override
    public void printAllStudents() throws SQLException {
        PreparedStatement ps = conn.prepareStatement(PRINT_ALL_STUDENTS);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)); // ResultSet

        }
        rs.close();
        ps.close(); // close() → Resources free karta hai.

    }

    @Override
    public List<student> getAllStudents() throws SQLException {

        PreparedStatement ps = conn.prepareStatement(GET_ALL_STUDENTS);
        ResultSet rs = ps.executeQuery();
        List<student> students = new ArrayList<>();
        while (rs.next()) {
            student s = new student();
            s.setId(rs.getInt(1));
            s.setName(rs.getString(2));
            s.setEmail(rs.getString(3));
            s.setGender(rs.getString(4));
            students.add(s);

        }

        rs.close();
        ps.close(); // close() → Resources free karta hai.
        return students;

    }

}
