package com.springapp.controller;

import com.springapp.entity.Greeting;
import com.springapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Create a Controller class to handle HTTP requests related to greeting
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    //Create an instance of GreetingService It is automatically injects
    @Autowired
    private GreetingService greetingService;


    //Create a method to handle get request
    @GetMapping(value = {"/hello"})
    public String getGreeting(){
        return "{\n\t\"message\" : \"Hello World!\"\n}";
    }

    //Create a method getSimpleGreeting to return the simple greeting message
    @GetMapping("/simplegreeting")
    public String getSimpleGreeting(){
        return greetingService.getSimpleGreeting();
    }

    //Create a getGreetingWithUserDetails method to print greeting massage with person details like their first and last name
    @GetMapping("/personalized")
    public String getGreetingWithUserDetails(@RequestParam(required = false)String firstName, @RequestParam(required = false)String lastName){
        return greetingService.getUserGreeting(firstName,lastName);
    }

    //Create a method saveGreeting to saves a Greeting entity to the database
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody Greeting greeting){
        return greetingService.saveGreeting(greeting);
    }

    //Create a method getGreetingById to search greeting massage using id number
    @GetMapping("/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable Long id){
        return  greetingService.findGreetingById(id);
    }

    //Create a method findAllGreets to find all greeting messages and call the method of GreetingService class
    @GetMapping("/all")
    public List<Greeting> findAllGreets(){
        return greetingService.findAllGreets();
    }
}
