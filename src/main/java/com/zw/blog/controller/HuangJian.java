package com.zw.blog.controller;/**
 * Description :
 *
 * @author by hj on 2018-4-11.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description :
 * @author by hj on 2018-4-11.
 */
@Controller
@RequestMapping(value = "/hj")
public class HuangJian {

    private Logger logger = LoggerFactory.getLogger(HuangJian.class);

    @RequestMapping(value = {"/", "index"})
    public String index() {
        return "index";
    }
}
