package com;


public class Test {
	
	private int empID;
	
	private String empName;
	
	private double salary;

	public Test(int empID, String empName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}