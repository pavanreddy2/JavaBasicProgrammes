package com.methodExamples;

class B {
 int s = 200;
}

class A {

	B m11() {
		B x = new B();
		int s2 = x.s;
		System.out.println(s2);
		return x;
	}

	String s = "fjjj";

	// Instance Method
	String m1() {
		// System.out.println("m1-A");
		return "ABC";

	}

	int m2() {
		return 100;
	}

}

public class Test {
	public static void main(String[] args) {

		A a = new A();

		String m1 = a.m1();
		System.out.println(m1);

		int m2 = a.m2();

		System.out.println(m2);

		
		B m11 = a.m11();
		System.out.println(m11);
		
	}
}
