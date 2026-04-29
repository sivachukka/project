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

import com.nit.entity.Student;
import com.nit.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	//fetch all studnets
	@GetMapping
	public List<Student> fetchAllStudent() {
		
		return service.getAllStudent();
	}

	//fetch by id
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable int id) {
		
		return service.getStudentById(id);
	}
	@PostMapping("/saveStudent")
	public void saveStudent(@RequestBody Student s) {
		service.savestudent(s);
	}
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student s) {
		return service.updateStudent(id, s);
		
		
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
	    
		 service.deleteStudent(id);
		 return "deleted";
	}
	@PostMapping("/saveAll")
    public List<Student> saveAll(@RequestBody List<Student> students) {
        return service.saveAllStudents(students);
    }
}
