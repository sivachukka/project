package com.nit.service;

import java.util.List;

import com.nit.entity.Employee;


public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int eid);
	public void saveEmployee(Employee e);
	public Employee updateEmployee(int eid,Employee e);
	public void deleteEmployee(int eid);
	
	List<Employee> saveAllEmployees(List<Employee> employees);

}
