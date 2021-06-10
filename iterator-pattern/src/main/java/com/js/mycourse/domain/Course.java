package com.js.mycourse.domain;

import lombok.Data;

@Data
public class Course {

    public Course(String name) {
        this.name = name;
    }

    private String name;
}
