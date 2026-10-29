package com.learning.hbn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Address ka bhi new table banega with id which will be unique
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String city, state;

    public Addresses() {
        super();
    }

    public Addresses(String city, String state) {
        // this.id = id;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
    }

}
