package com.methodsExample;

class A {
	 static synchronized  void m1() {
  System.out.println("m1 -A");
	}
}

public class Test {

	public static void main(String[] args) {
		
		  A a = new A(); 
		  a.m1();
	
		 
	}
}
