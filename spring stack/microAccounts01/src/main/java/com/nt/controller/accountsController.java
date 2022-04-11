package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RefreshScope
@RequestMapping("/accounts")
public class accountsController {

	
	@Value("${server.port}")	
	private int port ;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceName ; 
	
	@Value("${dbuser}")
	private String dbuser ; 
	
	
	@Value("${dbpwd}")
	private String dbpwd ; 
	
	@GetMapping("/info")
	public String accountsInfo()
	{
	return "accounts controller class " + "port no is -> "+port + "with instaance name as =====>"+ instanceName
			+ "db user is " + dbuser + "password for the same is " + dbpwd;	
		
	}
	
	
}
