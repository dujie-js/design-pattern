package com.js;

import com.js.spring.ExecuteHandler;
import com.js.spring.Handler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChainResponsibilityPatternApplicationTests {

    @Autowired
    private ExecuteHandler executeHandler;

    @Test
    void contextLoads() {
        Handler handler = executeHandler.getHandler();
        handler.doHandle(1);
    }

}
