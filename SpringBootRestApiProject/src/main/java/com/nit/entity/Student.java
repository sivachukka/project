package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String sname;
	private String saddr;
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
		return "Student [sid=" + id + ", sname=" + sname + ", saddr=" + saddr + "]";
	}

}
