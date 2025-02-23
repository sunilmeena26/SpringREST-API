package com.springapp.controller;

import org.springframework.web.bind.annotation.*;

//Create a Controller class to handle requests for greeting and return JSON for different HTTP Methods.
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    //Create a method to handle get request
    @GetMapping(value = {"/hello",""})
    public String getGreeting(){
        return "{\n\t\"message\" : \"Hello World!\"\n}";
    }

    //Create a method postGreeting to handle post request and created greeting
    @PostMapping
    public String postGreeting(@RequestBody String message){
        return "{\n\t\"Created greeting message\" : \""+message+"!\"\n}";
    }

    //Create a method putGreeting to handle put request and update greeting
    @PutMapping
    public String putGreeting(@RequestBody String message){
        return "{\n\t\"Updated greeting message\" : \""+message+"!\"\n}";
    }

    //Create a method deleteGreeting to handle delete request and delete greeting
    @DeleteMapping
    public String deleteGreeting(){
        return "{\n\t\"Deleted greeting message\"\n}";
    }
}
