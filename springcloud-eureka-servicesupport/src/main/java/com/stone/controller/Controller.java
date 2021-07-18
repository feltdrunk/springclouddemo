package com.stone.controller;

/**
 * @Author: Stone
 * @Date: 2021/7/18
 * @Version:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Controller {
    @RequestMapping("/world")
    public String helloWorld(String s) {
        System.out.println("传入的值为：" +s);
        return "传入的值为：" +s;
    }
}
