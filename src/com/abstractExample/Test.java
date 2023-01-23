package com.abstractExample;

public class Test {

	String s = "pavan";
	
	public static void main(String[] args) {
		
		//A a = new A();  // error
		
		
		A a = new B();
		a.m1();
		a.m2();
		a.m3();
		//a.m4();  //error
		
		System.out.println("*****************");
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}

}
