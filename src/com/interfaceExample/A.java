package com.interfaceExample;

public class A implements I{

	@Override
	public void m1() {
	
		System.out.println("m1-A");
	}

	@Override
	public void m2() {
	
		System.out.println("m2 - A");
	}

	@Override
	public void m3() {
		System.out.println("m3-A");
		
	}
	
	public void m4() {
		System.out.println("m4-A");
	}

}
