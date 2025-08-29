package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myservices")
public class MyController {

	@Autowired
	Service service;
	
	@GetMapping("/add/{num1}/{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2) {
		return service.add(num1,num2);
		
	}
	
}
