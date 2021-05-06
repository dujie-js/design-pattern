package com.js;

import com.js.base.Department;
import com.js.intefaces.OrganizationComponent;
import com.js.normal.Collage;
import com.js.normal.University;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompositePatternApplicationTests {

    @Test
    void contextLoads() {

        //从大到小创建对象
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        //创建学院
        OrganizationComponent collage = new Collage("计算机", "计算机学院");
        OrganizationComponent collage2 = new Collage("水利", "水利学院");


        //学院下的系
        Department department = new Department("软件工程", "软件工程系");
        Department department2 = new Department("网络工程", "网络工程系");
        collage.add(department);
        collage.add(department2);

        collage2.add(new Department("水利工程", "水利工程系"));

        university.add(collage);
        university.add(collage2);

        university.print();

        collage.print();

        collage2.print();
    }

}
