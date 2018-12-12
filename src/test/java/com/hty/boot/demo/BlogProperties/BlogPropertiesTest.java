package com.hty.boot.demo.BlogProperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application.properties")
public class BlogPropertiesTest {
    @Autowired
    private BlogProperties blogProperties;
    @Test
    public void getName() {
        System.out.println(blogProperties.getName());
    }

    @Test
    public void getTitle() {
    }
}