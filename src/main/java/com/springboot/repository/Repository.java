package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springboot.model.Greetings;

@Component
public interface Repository extends JpaRepository<Greetings,Integer> {

}
