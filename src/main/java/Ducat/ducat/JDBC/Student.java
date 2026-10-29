package Ducat.ducat.JDBC;

public class Student {

    private int sno, age;
    private String name, email, gender;

    public Student(int sno, int age, String name, String email, String gender) {
        this.sno = sno;
        this.age = age;
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    public Student() {
        super();
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "Student [sno=" + sno + ", age=" + age + ", name=" + name + ", email=" + email + ", gender=" + gender
                + "]";
    }

}
