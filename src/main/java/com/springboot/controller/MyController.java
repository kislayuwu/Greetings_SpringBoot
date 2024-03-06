package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Greetings;
import com.springboot.services.GreetingsServices;

@RestController
@RequestMapping("/greeting")
public class MyController {

	 @Autowired
	    private GreetingsServices service;
	 
	 @PostMapping("/add")
	 public Greetings addGreeting(Greetings greeting) {
		 return service.addGreeting(greeting);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<HttpStatus> deleteGreeting(@PathVariable int id) {
	        try {
	            service.removeGreeting(id);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	 }
	 
     @PutMapping("/update")
     	public Greetings updateGreeting(Greetings greeting) {
         return service.addGreeting(greeting);
	 }
	 
     @GetMapping("/get/{id}")
     	public Greetings getGreetingById(Integer id) {
     	   return service.getGreetingById(id);
     	}
     
     @GetMapping("/get")
     	public List<Greetings> getGreetings(){
    		return service.getGreetings();
    	}
}
