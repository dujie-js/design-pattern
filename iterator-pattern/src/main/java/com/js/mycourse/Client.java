package com.js.mycourse;

import com.js.mycourse.aggregate.CourseAggredateImpl;
import com.js.mycourse.domain.Course;
import com.js.mycourse.intefaces.CourseAggregate;
import com.js.mycourse.intefaces.Iterator;

public class Client {
    public static void main(String[] args) {
        Course java = new Course("Java架构");
        Course javaBean = new Course("Java 入门");
        Course design = new Course("Java设计模式");
        Course ai = new Course("人工智能");

        CourseAggregate courseAggregate = new CourseAggredateImpl();
        courseAggregate.add(java);
        courseAggregate.add(javaBean);
        courseAggregate.add(design);
        courseAggregate.add(ai);
        System.out.println("------- 课程列表 ----------------");
        printCourses(courseAggregate);

        courseAggregate.remove(ai);

        System.out.println("------ 删除课程列表");

        printCourses(courseAggregate);

    }

    private static void printCourses(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println("==========================");
            Course course = iterator.next();
            System.out.println(course);
        }
    }
}
