package com.staticKeywordExample;



class IS{
	static {
		System.out.println("SB-IS");
	}
	static int i = m1();
	
	static int m1() {
		System.out.println("m1-IS");
		return 10;
	}
	
	IS () {
		System.out.println("IS-Constructor");
	}
	
	//Instance block
	{
		System.out.println("IB-IS");
	}
	
	int j = m2();
	
	int m2() {
		System.out.println("m2-IS");
		return 19;
	}
	
}
public class InstanceAndStaticContextExample {

	public static void main(String[] args) {
		
		IS a = new IS();
		//SB-IS
		//m1-IS
		//IB-IS
		//m2-IS
		//IS-Constructor
		
		
		System.out.println("*****");
		IS a1 = new IS();
		
		// IB-IS
		// m2-IS
		//IS-Constructor
		
		System.out.println("******");
		IS a2 = new IS();
		//IB-IS
		//m2-IS
		
		//IS-Constructor
		System.out.println("******");
		
		IS a3 = new IS();
		
		//
	}
}

