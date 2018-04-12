package com.zw.blog.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gan zw
 * @date 2018/4/9 0009
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @ApiOperation(value="获取图书列表", notes="获取图书列表")
    @RequestMapping(value = {"/", "index"},method= RequestMethod.GET)
    public String index() {
        return "index";
    }



}
