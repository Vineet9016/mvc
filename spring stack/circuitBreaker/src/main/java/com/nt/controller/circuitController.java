package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/home")
public class circuitController {
	int count = 0 ; 
	
	@GetMapping("/display")
	@HystrixCommand(fallbackMethod="dummydisplay", commandProperties = {
			
			@HystrixProperty(name="circuitBreaker.enabled", value="true")
			
	})
	public String display()
	{
		
		System.out.println("business logic");
		
		if(new Random().nextInt(10)<10)
			throw new RuntimeException("wrong logic");
		return "output from business logic " ; 
		
	}
	
	
	
	public String dummydisplay()
	{
		count++;
		System.out.println("dummydisplay");
		return "please try again  after dummy display" ; 
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
