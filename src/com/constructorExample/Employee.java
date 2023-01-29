package com.constructorExample;

public class Employee {

	private String ename;
	private String edep;
	private float esal;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdep() {
		return edep;
	}

	public void setEdep(String edep) {
		this.edep = edep;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	
	//Parameterized Constructor
	public Employee(String ename, String edep, float esal) {
		super();
		this.ename = ename;
		this.edep = edep;
		this.esal = esal;
	}

	//copy Constructor
	public Employee(Employee employee) {
	
		this.edep = employee.edep;
		this.ename = employee.ename;
		this.esal = employee.esal;
	}
}
