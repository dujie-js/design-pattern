package com.js.mycourse.aggregate;

import com.js.mycourse.domain.Course;
import com.js.mycourse.intefaces.CourseAggregate;
import com.js.mycourse.intefaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggredateImpl implements CourseAggregate {

    private List courceList;

    public CourseAggredateImpl() {
        courceList = new ArrayList();
    }

    @Override
    public void add(Course course) {
        courceList.add(course);
    }

    @Override
    public void remove(Course course) {
        courceList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(courceList);
    }
}
