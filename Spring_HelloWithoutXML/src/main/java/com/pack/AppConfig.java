package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.pack")
public class AppConfig
{
	@Bean
	public HelloBean getHelloBean()

	{
		HelloBean hb=new HelloBean();
		return hb;
	}
}
