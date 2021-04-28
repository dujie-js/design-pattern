package com.js;

import com.js.strategy.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyServiceApplicationTests {

    @Autowired
    private TestService testService;
    @Test
    void contextLoads() {
        testService.test(0);
        testService.test(1);
    }

}
