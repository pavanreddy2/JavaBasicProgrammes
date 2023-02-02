package com.constructorExample;


class B {
	
	void m1 () {
		System.out.println("m1-B");
		m2();
     // this.m2();
	}
	void m2() {
		System.out.println("m2-B");
	}
}
public class ThisForMethods {

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
	
	}
}
