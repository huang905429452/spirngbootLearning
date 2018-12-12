package com.hty.boot.demo;

import com.hty.boot.demo.BlogProperties.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@PropertySource(value="classpath:application.properties", encoding= "UTF-8")
public class DemoApplicationTests {
    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void contextLoads() throws  Exception{
    }
    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "黄DD");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot");
    }

}
