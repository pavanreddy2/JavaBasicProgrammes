package com.interfaceExample;

public class Test {

	public static void main(String[] args) {
		
		I i = new A();
		//i is the reference variable for Interface
		//new A() ==> object for Sub Class
		i.m1();
		i.m2();
		i.m3();
		//i.m4();// Error
		
		System.out.println("*********************");
		A a = new A();
		// a is reference variable for sub class
		// new A() ==> Object creation for sub class
		//Note : we are not able to create Object for Interface
		
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		System.out.println("********************");
		System.out.println(I.x);
		System.out.println(i.x);
		System.out.println(A.x);
		System.out.println(a.x);
	}

}
