package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ApplicationConfig 
{
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/jsp/");
		view.setSuffix(".jsp");
		return view;
	}

}
