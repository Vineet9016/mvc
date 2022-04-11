package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
public class cardsController {
	
	@Autowired
	private feignInterface fi ; 
	
	
	@GetMapping("/info")
	public String display() 
	{
		return "welcome to cards" ; 
	}

}
