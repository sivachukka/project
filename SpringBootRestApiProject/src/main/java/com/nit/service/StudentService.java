package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	public Student getStudentById(int id);
	public void savestudent(Student s);
	public Student updateStudent(int id,Student s);
	public void deleteStudent(int id);
	List<Student> saveAllStudents(List<Student> students);
	

}
