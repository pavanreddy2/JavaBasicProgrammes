package com.staticKeywordExample;
class C{
	
	int i = 10;
	
	//static method
	static void m1() {
		System.out.println("m1-C");
	}
	
	void m2() {
		
		System.out.println("m2-C");
	}
}
public class StaticMethodExample {

	public static void main(String[] args) {
		C c = new C();
		
		c.m1();
		C.m1();
		
		C c1 = null;
		
		//Instance method
		//c1.m2();  ==> NullPointException
		
		c1.m1();
		

	}

}
