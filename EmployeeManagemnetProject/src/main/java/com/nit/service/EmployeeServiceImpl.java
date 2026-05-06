package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=repo.findAll();
		
		return list;
	}

	@Override
	public Employee getEmployeeById(int eid) {
	  Employee e1=repo.getById(eid);
		return e1;
	}

	@Override
	public void saveEmployee(Employee e) {
	 repo.save(e);
		
	}

	@Override
	public Employee updateEmployee(int eid, Employee e) {
		Employee s1=repo.findById(eid).get();
		s1.setEName(e.getEName());
		s1.setEAddress(e.getEAddress());
		s1.setSalary(e.getSalary());
		repo.save(s1);
		return s1;
	}

	@Override
	public void deleteEmployee(int eid) {
		Employee e=repo.findById(eid).get();
		repo.delete(e);
	}

	@Override
	public List<Employee> saveAllEmployees(List<Employee> employees) {
		  if (employees == null || employees.isEmpty()) {
	            throw new RuntimeException("employee list should not be empty");
	        }

	        return repo.saveAll(employees);
		
	}

}
