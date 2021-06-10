package com.js.mycourse.intefaces;

import com.js.mycourse.domain.Course;

public interface CourseAggregate {

    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
