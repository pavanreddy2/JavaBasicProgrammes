package com.staticKeywordExample;


class A {
	
	static int i = 10;
	int j = 20;
	
	void m1 () {
		//static int k = 30;  ==> error
		System.out.println("m1-A");
		System.out.println(this.i);
	}

}
public class staticVariableExample {
	
	public static void main(String[] args) {
	
		
		A a = new A();
		
		System.out.println(a.i);
		System.out.println(A.i);

		
		a.m1();
		
		A a1 = null;
		//System.out.println(a1.j);==> Null point Exception
		
		System.out.println(a1.i);
		
		
		
	}
}
