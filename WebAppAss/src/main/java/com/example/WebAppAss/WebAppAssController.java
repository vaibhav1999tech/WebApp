package com.example.WebAppAss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppAssController {
@RequestMapping("/")
    public String HelloWorld(){
    return "this is a java file for kubernetes mini project";
}

@RequestMapping("/page2")
    public String hihello(){
    return "hi this is the second page";
}
}

