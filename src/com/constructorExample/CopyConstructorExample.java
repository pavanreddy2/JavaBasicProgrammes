package com.constructorExample;

public class CopyConstructorExample {

	public static void main(String[] args) {
		
		Employee employee = new Employee("ABC", "Engineer",2300.00f);
		
		Employee employee1 = new Employee(employee);
		
		
		
		System.out.println(employee.getEname());
		System.out.println(employee.getEdep());
		System.out.println(employee.getEsal());
		
		System.out.println("*************");
		
		System.out.println(employee1.getEname());
		System.out.println(employee1.getEdep());
		System.out.println(employee1.getEsal());
	}

}
