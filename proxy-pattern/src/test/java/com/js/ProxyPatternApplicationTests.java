package com.js;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ProxyPatternApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(generate(3));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) {
            return null;
        }
        List<Integer> one = new ArrayList<>();
        one.add(1);
        result.add(one);
        if (numRows == 1) {
            return result;
        }
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        result.add(two);
        if (numRows == 2) {
            return result;
        }
        // 外层循环控制行数变化 每行对应的数据个数和行数相同
        for (int i = 3; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            // 内层对每行数据进行处理
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    temp.add(1);
                } else {
                    List<Integer> tempInt = result.get(i - 2);
                    System.out.println(tempInt);
                    temp.add(tempInt.get(j - 1) + tempInt.get(j));
//                    result.add(tempInt);
                }
            }
            result.add(temp);
        }
        return result;
    }

}
