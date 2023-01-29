package com.methodExample;

public class EmployeeDetails {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		emp.setEno(111);
		emp.setEname("malli");
		emp.setEsal(50000.00f);
		emp.setEadd("Kurnool");
		
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getEsal());
		System.out.println(emp.getEadd());
	}

}
