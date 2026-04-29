package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo repo;

	@Override
	public List<Student> getAllStudent() {
		
		List<Student>list=repo.findAll();
	
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		
		Student s=repo.findById(id).orElseThrow(()-> new RuntimeException("Student not found with id:"+id));
	
		return s;
	}

	@Override
	public void savestudent(Student s) {
		 if (s == null) {
	            throw new RuntimeException("Student  should not be empty");
	        }
		repo.save(s);
		
	}

	@Override
	public Student updateStudent(int id, Student s) {
		Student s1=repo.findById(id).get();
		s1.setSname(s.getSname());
		s1.setSaddr(s.getSaddr());
		repo.save(s1);
		return s1;
	}

	@Override
	public void deleteStudent(int id) {
	Student s=repo.findById(id).get();
	repo.delete(s);
		
	}

	@Override
	public List<Student> saveAllStudents(List<Student> students) {
		  // Optional: validation or business logic
        if (students == null || students.isEmpty()) {
            throw new RuntimeException("Student list should not be empty");
        }

        return repo.saveAll(students);
	}

	
	
	

}
