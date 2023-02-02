package com.staticKeywordExample;

class D {
	
	
	//Instance Variable
	int i = 10;
	static int j = 100;
	
	static void m1() {
		//System.out.println(i);  ==> Error
		
		D d1 = new D();
		System.out.println(d1.i);
		
		System.out.println(j);
		
		//System.out.println(this.j);
	}
}
public class StaticMethodExample2 {

	public static void main(String[] args) {
		D d = new D();
		
		d.m1();

	}

}
