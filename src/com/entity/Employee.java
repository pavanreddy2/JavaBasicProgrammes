package com.entity;

public class Employee {

	String eid = "e-102";
	String ename = "malli";
	float esal = 45000.0f;

	//concreate method //Non-Static Method
	public void getEmpDeatils()   //Declarative Part
	{
											//Method implementation/ method Body
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	
	
	//public abstract void m2();  // abstract method
}
