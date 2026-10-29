package Ducat.ducat.JDBC_PREPAREST;

public class student {

    private int id;
    private String name, email, gender;

    public student(int id, String name, String email, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    public student() {

        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }

}
