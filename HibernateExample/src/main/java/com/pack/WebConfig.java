package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.pack")
public class WebConfig extends WebMvcConfigurerAdapter

{
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
@Bean
public InternalResourceViewResolver viewResolver()
{
	InternalResourceViewResolver view=new InternalResourceViewResolver();
	view.setViewClass(Employee.class);
	view.setPrefix("/WEB-INF/views");
	view.setSuffix(".jsp");
	return view;
	
}
}
