package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message="Student name must not be blank")
	private String sname;
	@NotBlank(message="Student address must not be blank")
	private String saddr;
	@Size(min=10,max=10,message="Phone number must be 10 digits")
	private String sphone;
	@Email(message="Invalid email formate")
	private String semail;
	@Min(value=18,message="Age must be at least 18 years old")
	@Max(value=60,message="Age must be below 60")
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getid() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	 public Student(){
		
	}
	public Student( String sname, String saddr) {
		
		this.sname = sname;
		this.saddr = saddr;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", saddr=" + saddr + ", sphone=" + sphone + ", semail="
				+ semail + ", age=" + age + "]";
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}

}
