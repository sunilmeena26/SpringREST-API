package com.springapp.repository;

import com.springapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Create an interface GreetingRepository to extends JpaRepository which provides built-in methods for basic database CRUD operations
@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
