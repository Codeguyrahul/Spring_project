package com.rahul.batch4119.springboot.EmployeeExample.spring.boot.employee.example.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee_info")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int id;
	private String Employee_Name;
	private int Employee_Salary;
	private String Employee_emailid;
	private String Employee_Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public int getEmployee_Salary() {
		return Employee_Salary;
	}
	public void setEmployee_Salary(int employee_Salary) {
		Employee_Salary = employee_Salary;
	}
	public String getEmployee_emailid() {
		return Employee_emailid;
	}
	public void setEmployee_emailid(String employee_emailid) {
		Employee_emailid = employee_emailid;
	}
	public String getEmployee_Address() {
		return Employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		Employee_Address = employee_Address;
	}
	public Employee(String employee_Name, int employee_Salary, String employee_emailid, String employee_Address) {
		super();
		Employee_Name = employee_Name;
		Employee_Salary = employee_Salary;
		Employee_emailid = employee_emailid;
		Employee_Address = employee_Address;
	}
	public Employee() {
	}
}
