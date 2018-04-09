package com.zw.blog.service.impl;

import com.zw.blog.dao.BlogMapper;
import com.zw.blog.model.Blog;
import com.zw.blog.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gan zw
 * @date 2018/4/9 0009
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Resource(name = "blogMapper")
    private BlogMapper blogMapper;

    @Override
    public Blog getByExample(String id) {
        return blogMapper.selectByPrimaryKey(id);
    }
}
