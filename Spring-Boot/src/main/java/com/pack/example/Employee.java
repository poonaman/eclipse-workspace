package com.pack.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	public Employee(Integer id, String name, String dept, Integer age, Double sallary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.sallary = sallary;
	}
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="age")
	private Integer age;
	@Column(name="sallary")
	private Double sallary;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Double getSallary() {
	return sallary;
}
public void setSallary(Double sallary) {
	this.sallary = sallary;
}
	
}
