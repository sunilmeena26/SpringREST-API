package com.springapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

//Create a Service class to handle greeting-related operations
@Service
public class GreetingService {

    //Create a method to print th simple Greeting
    public String getSimpleGreeting(){
        return "Hello World";
    }

    //Create a method getUserGreeting return greeting message with user first and last name if first and last name null than print "Hello World"
    public String getUserGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        } else {
            return "Hello World";
        }
    }
}
