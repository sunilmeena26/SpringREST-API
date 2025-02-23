package com.springapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Create an Entity class It will mapped to a database table
@Entity
public class Greeting {

    //Create a variable id,firstName,lastName, and message
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String message;

    //Create a getter method to return the id
    public Long getId() {
        return id;
    }

    //Create a setter method to initialize the id
    public void setId(Long id) {
        this.id = id;
    }

    //Create a getter method to return the first name
    public String getFirstName() {
        return firstName;
    }

    //Create a setter method to initialize the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Create a getter method to return the last name
    public String getLastName() {
        return lastName;
    }

    //Create a setter method to initialize the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Create a getter method to return the message
    public String getMessage() {
        return message;
    }

    //Create a setter method to initialize the message
    public void setMessage(String message) {
        this.message = message;
    }
}
