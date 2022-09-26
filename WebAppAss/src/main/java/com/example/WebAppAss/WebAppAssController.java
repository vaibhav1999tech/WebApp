package com.example.WebAppAss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppAssController {
@RequestMapping("/")
    public String HelloWorld(){
    return "hello vaibhav from spring boot application";
}
}
