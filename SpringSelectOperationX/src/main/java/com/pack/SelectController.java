package com.pack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SelectController extends AbstractController 
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		// TODO Auto-generated method stub
		List<Employee> emp=DatabaseConnection.select();
		ModelAndView  model =new ModelAndView("index");
		model.addObject("list",emp);
		return model;
	}

}
