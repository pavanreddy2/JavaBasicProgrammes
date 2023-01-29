package com.objects;


final class Calculator {
	
	private final int count;
	
	public Calculator (int count) {
		this.count = count;
	}

	public int getCount() {
		return this.count;
	}
	
	public Calculator increament () {
		
		Calculator cal = new Calculator (this.count + 1);
		return cal;
	}
	
	public Calculator decreament () {
		Calculator cal = new Calculator (this.count -1);
		return cal;
	}
	
}

public class UserDefinedObject {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10);
		
		System.out.println(c1 +" :count "+ c1.getCount());
		
		 Calculator c2 = c1.increament();
		 
		 System.out.println(c2 + " :count: " +c2.getCount());
		 
		 System.out.println(c1.getCount());
		 
		 
		 Calculator c3 = c2.decreament();
		 System.out.println(c3.getCount());
		    Calculator c4 = c3.decreament();
		    System.out.println(c4.getCount());

	}

}
