package com.zw.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:com.zw.context.xml" })
public class TestBlogService {

    @Resource(name = "blogService")
    private BlogService blogService;

    @Test
    public void findOne() {
        System.out.println(blogService.getByExample("1"));
    }

}
