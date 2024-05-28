package com.avinash.SpringJWT2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home(){
        return "Hello World...!";
    }

    @GetMapping("/about")
    public String about(){
        return "About";
    }
}
