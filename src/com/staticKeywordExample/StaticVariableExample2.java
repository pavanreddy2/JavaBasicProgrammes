package com.staticKeywordExample;

class A1 {

	int i = 10;
	static int j = 10;
}

public class StaticVariableExample2 {
	public static void main(String[] args) {

		A1 a1 = new A1();
		System.out.println(a1.i + "  " + a1.i);
		
		a1.i = a1.i+1; 
		a1.j = a1.j+1;
		
		System.out.println(a1.i+" " + a1.j);
		
		System.out.println("************");
		
		A1 a2 = new A1();
		System.out.println(a2.i + "  " + a2.i);
		
		a2.i = a2.i+1; 
		a2.j = a2.j+1;
		
		System.out.println(a1.i+" " + a1.j);
		System.out.println(a2.i+ " "+a2.j);
		
		System.out.println("**************");
		
		A1 a3 = new A1();
		System.out.println(a3.i + "  " + a3.i);
		
		a3.i = a3.i+1; 
		a3.j = a3.j+1;
		
		System.out.println(a1.i+" " + a1.j);
		System.out.println(a2.i+ " "+a2.j);
		System.out.println(a3.i+ " "+a3.j);
	}
}
