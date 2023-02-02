package com.staticKeywordExample;

class E {

	// Instance Variable
	int i = 20;

	static int j = 100;
	static {
		System.out.println("SB-D");
		// System.out.println(i);==> Compilation error
		System.out.println(j);
		
		 E e = new E();
		 System.out.println(e.i);
		 
		// System.out.println(this.j);
	}
}

public class StaticBlockExample {
	public static void main(String[] args) {

		E e = new E();

	}
}
