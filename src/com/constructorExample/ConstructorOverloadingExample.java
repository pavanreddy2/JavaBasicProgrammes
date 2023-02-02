package com.constructorExample;

class A {
	
	int i,j,k;
	
	A () {
		
	}
	
	A (int x) {
		i =x;
	}
	
	A (int x, int y){
		i = x;
		j= y;
	}
	
	A (int x, int y, int z){
		i =x;
		j= y;
		k = z;
	}
	
	public void add () {
		System.out.println("addition : "+(i+j+k));
	}
}

public class ConstructorOverloadingExample {
	public static void main(String[] args) {
		
		A a = new A();
		a.add();
		
		A a1 = new A(10);
		a1.add();
		
		A a2 = new A(10,20);
		a2.add();
		
		A a3 = new A(10,20,30);
		
		a3.add();
	}
}
