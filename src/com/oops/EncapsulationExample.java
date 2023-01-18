package com.oops;

public class EncapsulationExample {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEid("E-101");
		employee.setEname("Suresh");

		System.out.println(employee.getEid());
		System.out.println(employee.getEname());

		System.out.println("************************************");
		Employee employee1 = new Employee();
		employee1.setEid("E-102");
		employee1.setEname("Venkat");

		System.out.println(employee1.getEid());
		System.out.println(employee1.getEname());
		
		System.out.println("************************************");
		Employee employee2 = new Employee();
		employee2.setEid("E-103");
		employee2.setEname("Madhu");

		System.out.println(employee2.getEid());
		System.out.println(employee2.getEname());
	}
}
