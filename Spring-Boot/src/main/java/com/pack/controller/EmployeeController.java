

package com.pack.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pack.example.Employee;
import com.pack.example.EmployeeService;

@Controller

public class EmployeeController 
{

	@Autowired
	private EmployeeService employeeSerivce;
	 
	@Autowired
	public EmployeeController(EmployeeService employeeSerivce)
	{
		// TODO Auto-generated constructor stub
		this.employeeSerivce=employeeSerivce;
	}
	
	
	@RequestMapping(value="/employeepost",method=RequestMethod.POST, headers = "Accept=application/json")
	public String newEmployee(@ModelAttribute("employee") Employee employee,BindingResult result)
	{
		
		employeeSerivce.saveEmployee(employee);
	return ("redirect:/employee");
	}
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public String addnewEmployee(Map<String,Object> map)
	{
	List<Employee> employees=employeeSerivce.findEmployee();
	ModelAndView model=new ModelAndView("newEmployee");
	model.addObject(employees);
	map.put("newEmployee", employees);
	return "newEmployee";
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public ModelAndView addEmployee(Map<String,Object> map)
	{
	//List<Employee> employees=employeeSerivce.findEmployee();
	ModelAndView model=new ModelAndView("addEmpoyee");
	model.addObject("employee", new Employee());
	return model;
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String getIndex(Map<String,Object> map)
	{
      return "index";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public ModelAndView searchEmployee(@RequestParam("id") Integer id) 
	{
	ModelAndView mav = new ModelAndView("search");
	mav.addObject("searchTerm", employeeSerivce.findEmployee(id));	       
	return mav;
	}
	
	@RequestMapping(value="/searchPage",method=RequestMethod.GET)
	public ModelAndView searchPage() 
	{
	ModelAndView mav = new ModelAndView("searchPage");
    Employee employee=new Employee();
	mav.addObject(employee);
	return mav;
	}
	
	@RequestMapping(value="/deletePage",method=RequestMethod.GET)
	public ModelAndView deletePage() 
	{
	ModelAndView mav = new ModelAndView("deletePage");
    Employee employee=new Employee();
	mav.addObject(employee);
	return mav;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public ModelAndView deleteEmployee(@RequestParam("id") Integer id) 
	{
	ModelAndView mav = new ModelAndView("delete");
    employeeSerivce.deleteEmployee(id);	       
    return mav;
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView deleteEmployees(@PathVariable("id") Integer id) 
	{
	ModelAndView mav = new ModelAndView("delete");
    employeeSerivce.deleteEmployee(id);	       
    return mav;
	}
	
	@RequestMapping(value="/updatePage",method=RequestMethod.GET)
	public ModelAndView updatePage(Map<String,Object> map)
	{
	//List<Employee> employees=employeeSerivce.findEmployee();
	ModelAndView model=new ModelAndView("updateEmployee");
	model.addObject("employee", new Employee());
	return model;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST, headers = "Accept=application/json")
	public String update(@ModelAttribute("employee") Employee employee,BindingResult result)
	{
	employeeSerivce.updateEmployee(employee);
	return ("redirect:/employee");
	}
	@RequestMapping(value="/updatePages/{id}/{name}/{dept}/{age}/{sallary}",method=RequestMethod.GET)
	public ModelAndView updatePages(@PathVariable("id") Integer id,@PathVariable("name") String name,@PathVariable("dept") String dept,@PathVariable("age") Integer age,@PathVariable("sallary") Double sallary)
	{
	//List<Employee> employees=employeeSerivce.findEmployee();
	ModelAndView model=new ModelAndView("updateEmp");
	model.addObject("employee", new Employee(id,name,dept,age,sallary));
	return model;
	}
	
	@RequestMapping(value="/updates",method=RequestMethod.POST, headers = "Accept=application/json")
	public String updates(@ModelAttribute("employee") Employee employee,BindingResult result)
	{
	employeeSerivce.updateEmployee(employee);
	return ("redirect:/employee");
	}
}
