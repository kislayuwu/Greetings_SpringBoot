package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.springboot.model.Greetings;
import com.springboot.repository.Repository;

@Service
@Component
public class GreetingsServices {
	
 @Autowired
 Repository repo;
 
 public Greetings addGreeting(Greetings greeting) {
	 repo.save(greeting);
	 return greeting;
 }
 
 public Greetings removeGreeting(Integer greetId) {
	 Greetings greeting=repo.getReferenceById(greetId);
	 repo.delete(greeting);
	 return greeting;
 }
 
 public Greetings updateGreeting(Greetings greeting) {
	 repo.save(greeting);
	 return greeting;
 }
 
 public Greetings getGreetingById(Integer id) {
   return repo.findById(id).orElse(null);
}
 
public List<Greetings> getGreetings(){
	return repo.findAll();
}

}
