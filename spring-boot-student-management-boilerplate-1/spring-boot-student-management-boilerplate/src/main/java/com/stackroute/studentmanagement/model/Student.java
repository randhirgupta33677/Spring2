package com.stackroute.studentmanagement.model;

import javax.persistence.*;
import java.time.LocalDate;

/*
Add appropriate annotation/s to map the class and its properties with a Database entity
    - studentId should be unique and generated by the Database
    - table name should be students
 */
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String name;
    private String email;
    private String grade;
    private String phoneNo;
    private LocalDate dateOfAdmission;
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String name, String email, String grade, String phoneNo,
			LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.grade = grade;
		this.phoneNo = phoneNo;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
    

    // Define a no argument constructor

    // Define a all argument constructor

    // Define Getter and Setter for all Student fields
}
