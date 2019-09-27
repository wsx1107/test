package com.bat.mengfan.redis_demo;

import com.bat.mengfan.redis_demo.util.TokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(TokenUtil.getToken("fuck"));
    }

}
