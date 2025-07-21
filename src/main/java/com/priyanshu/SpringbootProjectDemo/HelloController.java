package com.priyanshu.SpringbootProjectDemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "This is a Hello from HelloController";
    }
}
