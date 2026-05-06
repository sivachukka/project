package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Employee;

import com.nit.service.EmployeeService;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public List<Employee> fetchAllEmployees(){
		return service.getAllEmployees();
	}
	@GetMapping("/{eid}")
	public Employee fetchEmployeeById(@PathVariable int eid) {
		return service.getEmployeeById(eid);
	}
	@PostMapping("/add")
	public String saveEmployee(@RequestBody Employee e) {
		 service.saveEmployee(e);
		 return "Employee Saved";
	}
	@PutMapping("/update/{eid}")
	public Employee updateEmployee(@PathVariable int eid,@RequestBody Employee e) {
		
		return service.updateEmployee(eid, e);
	}
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		 service.deleteEmployee(eid);
		 return "EmployeeDeleted Successfully";
	}
	@PostMapping("/saveAll")
    public List<Employee> saveAll(@RequestBody List<Employee> emp) {
        return service.saveAllEmployees(emp);
    }

}
