package com.DoctorApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Doctors_tables")
public class DoctorData {
	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Salary")
	private double salary;
	@Column (name = "Specialist")
	private String specialist;
	
	public DoctorData( int id, String name,double salary, String specialist) {
		super();
		this.id=id;
		this.name = name;
		this.salary = salary;
		this.specialist = specialist;
	}
	
	public DoctorData() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
}
