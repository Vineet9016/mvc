package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@RefreshScope
public class MicroAccounts01Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroAccounts01Application.class, args);
	}

}
