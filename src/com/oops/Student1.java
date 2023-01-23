package com.oops;

public class Student1 {

	int id; 
	String name;
	boolean nameq;

	
	void display() {
		System.out.println(id +" "+ name+ " "+nameq );
	}
	
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		
		Student1 s2 = new Student1();
		
		Student1 s3 = new Student1();
		
		s1.display();
		s2.display();
		s3.display();
		
		
		
		A a1 = new A ();
		
		//a1.msg();
	}
}
