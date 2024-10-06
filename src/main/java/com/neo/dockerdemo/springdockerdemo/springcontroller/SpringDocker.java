package com.neo.dockerdemo.springdockerdemo.springcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDocker {
    @GetMapping(value = "/docker")
    public String helloworld(){
        System.out.println("reethu");
        return "hello";
    }

}
