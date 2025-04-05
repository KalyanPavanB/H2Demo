package com.example.kalyan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    private long id;
    private String college;
    private String name;
    private String city;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
