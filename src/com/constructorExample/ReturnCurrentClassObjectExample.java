package com.constructorExample;

class CA {

	public CA getRef1() {

		CA c = new CA();
		return c;
	}

	public CA getRef2() {
		
		return this;
	}
}

public class ReturnCurrentClassObjectExample {

	public static void main(String[] args) {
	
		CA ca = new CA();
		
		System.out.println(ca);

		System.out.println();
		
		System.out.println(ca.getRef1());
		System.out.println(ca.getRef1());
		System.out.println(ca.getRef1());
		
		
		System.out.println();
		
		System.out.println(ca.getRef2());
		System.out.println(ca.getRef2());
		System.out.println(ca.getRef2());
		
	}

}
