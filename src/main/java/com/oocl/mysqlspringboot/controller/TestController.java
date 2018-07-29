package com.oocl.mysqlspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Wei
 * @date 2018-07-27 11:24
 */
@RestController
public class TestController {

    @GetMapping
    public String test(){
        return "哈哈哈哈哈哈啊";
    }

}
