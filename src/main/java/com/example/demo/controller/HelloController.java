package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.respository.StudentRepository;

@RestController
public class HelloController {
	
	@Autowired
	StudentRepository students;
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!" + students.findAll();
	}
}
