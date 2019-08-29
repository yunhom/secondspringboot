package com.yun.demo.controller;

import com.yun.demo.properties.GirlProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;


/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@RestController
@Slf4j
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("/say/{age}")
    public String say(@PathVariable("age") Integer age){
        return "age=" + age + ", girlProperties = " +girlProperties;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "age", defaultValue ="20") Integer age){
        return "age=" + age;
    }
}
