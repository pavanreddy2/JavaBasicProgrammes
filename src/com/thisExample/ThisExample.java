package com.thisExample;


class Person {
	String name;
	int age;
	
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Pavan",27);
		p.displayInfo();
		
	}

}
