package Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

//agar employee.hbm.xml file ko use nahi karna or direct class se he table create karna hai to use annotation use karna hai.

@Entity // annotation for creating table in database
public class Employee {

    @Id // annotation for creating primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // strategy for generating primary key value
    private int id;
    private String name, gender;
    private long salary;
    @Transient
    private String country;

    @OneToOne
    private Address address;

    public Employee(String name, String gender, long salary, String country, Address address) {
        super();
        // this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.country = country;
        this.address = address;
    }

    public Employee() {

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", country="
                + country + ", address=" + address + "]";
    }

}
