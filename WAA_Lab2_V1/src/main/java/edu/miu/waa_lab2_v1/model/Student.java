package edu.miu.waa_lab2_v1.model;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String coursesTaken;
    private double gpa;

    private List<Course> courses;
}
