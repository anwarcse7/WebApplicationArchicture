package edu.miu.waa_lab2_v1.model;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private String code;

    private Student student;
}
