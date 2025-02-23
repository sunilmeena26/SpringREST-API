package com.springapp.service;

import org.springframework.stereotype.Service;

//Create a Service class to handle greeting-related operations
@Service
public class GreetingService {

    //Create a method to print th simple Greeting
    public String getSimpleGreeting(){
        return "Hello World";
    }
}
