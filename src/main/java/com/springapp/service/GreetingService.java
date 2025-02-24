package com.springapp.service;

import com.springapp.entity.Greeting;
import com.springapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Create a Service class to handle greeting-related operations
@Service
public class GreetingService {
    //Create an instance of GreetingRepository It is automatically injects
    @Autowired
    private GreetingRepository greetingRepository;

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

    //Create a method saveGreeting to saves a Greeting entity to the database using the GreetingRepository
    public Greeting saveGreeting(Greeting greeting){
        return greetingRepository.save(greeting);
    }


    //Create a method getGreetingById to search greeting massage using id number in database
    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    //Create a method findAllGreeting to find all greeting massage
    public List<Greeting> findAllGreets(){
       return greetingRepository.findAll();
    }
}
