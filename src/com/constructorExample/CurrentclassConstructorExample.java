package com.constructorExample;


class C{
	
	C() {
		this(10);
		System.out.println("C-Const");
	}
	C (int i){
		this(33.22f);
		System.out.println("int-Param-Const-C");
	}
	
	C (float f){
		this(2345.5654);
		System.out.println("float-Param-Const-C");
	}
	
	C(double d ){
		
		System.out.println("double-Param-Const-C");
	}
}
public class CurrentclassConstructorExample {
	public static void main(String[] args) {
		
		C c = new C();
		
	}
}
