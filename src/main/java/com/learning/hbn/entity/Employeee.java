package com.learning.hbn.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

/*
1. @Transient annotation islye user hota hai taaki column database be na jaye or sirf transient state me rahe.
2. 
 */

@Entity() // annotation for creating table in database
public class Employeee {

    @Id // annotation for creating primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // strategy for generating primary key value
    private int id;

    private String name;
    private String gender;
    // annotation for not storing in database.Transient state ka matlab hota hai ki
    // object jo bana hai jo java ki memory me store rashega lekin persist nahi hoga
    // means database me nahi jayega
    @Transient
    private String country;
    private int salary;

    // @OneToOne ka matlab hai ek record ka relation sirf ek hi record se
    // hoga.Example:Ek Employee ka sirf ek Address hai., Ek Address sirf ek Employee
    // ka hai.@OneToOne sirf dono tables ke beech relation create karta hai.
    // cascade se jo bhi operations hum prforme karenge employee table pe uska
    // impact adddress table pe bhi padega. Means ki agar employee delete kiya to
    // address bhi table me se delete ho jayega.
    @OneToOne(cascade = CascadeType.ALL) // cascade type all means ki agar employee delete kiya to address bhi table me
                                         // se delete ho jayega. same insert query k liye bhi hoga
    @JoinColumn(name = "Add_id") // agar address column ka name change karna hai to.
    private Addresses address; // Association use hua h isme. Has a relationship between two tables.

    public Employeee() {
        super();
    }

    public Employeee(String name, String gender, String country, int salary, Addresses address) {
        // this.id = id;
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.salary = salary;
        this.address = address;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Addresses getAddress() {
        return address;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", country=" + country + ", salary="
                + salary + "]";
    }

}
