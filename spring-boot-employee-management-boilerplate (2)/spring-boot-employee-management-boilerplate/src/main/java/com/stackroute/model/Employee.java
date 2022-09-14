package com.stackroute.model;

import javax.persistence.*;
import java.time.LocalDate;

/*
Add appropriate annotation/s to map the class and its properties with a Database entity
    - employeeId should be unique and generated by the Database
    - table name should be employees_store
*/

@Entity
@Table(name="employees_store")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String sectorId;
    private String branchId;
    private LocalDate employeeJoiningDate;
    private String departmentName;
    private double salary;

    // Define a no argument constructor

    public Employee() {
    }


    // Define All argument constructor

    public Employee(Integer employeeId, String sectorId, String branchId, LocalDate employeeJoiningDate, String departmentName, double salary) {
        this.employeeId = employeeId;
        this.sectorId = sectorId;
        this.branchId = branchId;
        this.employeeJoiningDate = employeeJoiningDate;
        this.departmentName = departmentName;
        this.salary = salary;
    }


    // Define Getter and Setter for all Employee field

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getSectorId() {
        return sectorId;
    }

    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public LocalDate getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }

    public void setEmployeeJoiningDate(LocalDate employeeJoiningDate) {
        this.employeeJoiningDate = employeeJoiningDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}