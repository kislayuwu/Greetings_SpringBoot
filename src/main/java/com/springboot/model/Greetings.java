package com.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Greetings {
	
@Id
private Integer greetId;
private String greeting;
public Integer getGreetId() {
	return greetId;
}
public void setGreetId(Integer greetId) {
	this.greetId = greetId;
}
public String getGreeting() {
	return greeting;
}
public void setGreeting(String greeting) {
	this.greeting = greeting;
}

}
