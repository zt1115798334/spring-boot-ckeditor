package com.zt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangtong
 * Created by on 2017/12/11
 */
@Controller
@RequestMapping
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
