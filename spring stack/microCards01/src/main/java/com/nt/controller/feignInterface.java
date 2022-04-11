package com.nt.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("accounts")
public interface feignInterface {
	
	@GetMapping("/accounts/info")
	public String display() ; 
	

}
