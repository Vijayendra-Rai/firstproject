package com.springboot.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProjectController {

    @RequestMapping
    public String firstProjectMethod(){
        return "Hello World";
    }

    @RequestMapping("/new")
    public String newMethod(){
        return "New Method";
    }
}
