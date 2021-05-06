package com.js;

import com.js.project.domain.GiftInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacadePatternApplicationTests {

    @Test
    void contextLoads() {
        GiftInfo giftInfo = new GiftInfo("lis");
        System.out.println(giftInfo);
    }

}
