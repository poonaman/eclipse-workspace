package com.pack;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInit implements WebApplicationInitializer
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext app=new AnnotationConfigWebApplicationContext();
		app.register(ApplicationConfig.class);
		 ((Object) servletContext).addListener(new ContextLoaderListener( app));
		AnnotationConfigWebApplicationContext appanno=new AnnotationConfigWebApplicationContext();
		app.register(WebConfig.class);
		ServletRegistration.Dynamic registration= ((Object) servletContext).addServlet("dispatcher",new DispatcherServlet(appanno));
		registration.setLoadOnStartup(1);
		registration.addMapping("/web/*");
	}

}
