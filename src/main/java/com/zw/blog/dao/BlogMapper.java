package com.zw.blog.dao;

import com.zw.blog.model.Blog;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

@Repository
@MapperScan
public interface BlogMapper extends Mapper<Blog> {

}
