package com.springapp.controller;

import com.springapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Create a Controller class to handle HTTP requests related to greeting
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    //Create an instance of GreetingService It is automatically injects
    @Autowired
    private GreetingService greetingService;


    //Create a method to handle get request
    @GetMapping(value = {"/hello",""})
    public String getGreeting(){
        return "{\n\t\"message\" : \"Hello World!\"\n}";
    }

    //Create a method getSimpleGreeting to return the simple greeting message
    @GetMapping("/simplegreeting")
    public String getSimpleGreeting(){
        return greetingService.getSimpleGreeting();
    }

}
