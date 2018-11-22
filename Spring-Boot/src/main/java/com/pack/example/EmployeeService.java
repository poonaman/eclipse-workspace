package com.pack.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
	@Autowired
	private EmployeeRepository employeeRepository ;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		// TODO Auto-generated constructor stub
		this.employeeRepository=employeeRepository;
	}

	
	public void saveEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	
	}
	public List<Employee> findEmployee()
	{
		 return employeeRepository.findAll();
		 
	}
	public void deleteEmployee(Integer id)
	{
	
	employeeRepository.deleteById(id);
	} 
   public Employee findEmployee(Integer id)
	{
	return employeeRepository.getOne(id);
	}
   public void updateEmployee(Employee employee)
	{
	Employee employee1=employeeRepository.getOne(employee.getId());
	employee1.setName(employee.getName());
	employee1.setDept(employee.getDept());
	employee1.setAge(employee.getAge());
	employee1.setSallary(employee.getSallary());
	employeeRepository.save(employee1);
	}
}
