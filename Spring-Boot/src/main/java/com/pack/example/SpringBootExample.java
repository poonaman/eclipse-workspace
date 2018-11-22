package com.pack.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pack*")
public class SpringBootExample 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootExample.class, args);
		
	}

}
