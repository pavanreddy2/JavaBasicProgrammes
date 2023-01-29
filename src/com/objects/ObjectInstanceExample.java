package com.objects;


class A {
	
	int i = 10;
	int j = 20;
}
public class ObjectInstanceExample {
 public static void main(String[] args) {
	
	 
	 A a = new A ();
	 
	 for (int x = 1; x <= 10; x++) {
		 
		 a.i = a.i+1;
		 
		 a.j = a.j+1;
		 
		 System.out.println(a.i);
		 
		// System.out.println(a.j);
	 }
}
}
