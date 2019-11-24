package com.cout.incognito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan
public class IncognitoApplication {
	
	@Autowired
	public static void main(String[] args) throws Exception {
		SpringApplication.run(IncognitoApplication.class, args);
	
	}
	
	
}
