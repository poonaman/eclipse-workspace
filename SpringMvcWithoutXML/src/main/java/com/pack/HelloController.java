package com.pack;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloController 
{
	@RequestMapping(value="/hello",method=RequestMethod.GET)
   public ModelAndView helloWorld()
   {
	   ModelAndView model=new ModelAndView("index");
	   List<Employee> emp=DatabaseDAO.select();
	   model.addObject("list",emp);
	   return model;
   }
}
