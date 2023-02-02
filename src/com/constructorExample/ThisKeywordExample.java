package com.constructorExample;

class AB {

	int i = 10;
	int j = 20;

	AB(int i, int j) {

		System.out.println(i + "  " + j);

		System.out.println(this.i + "  " + this.j);
	}
}

public class ThisKeywordExample {
	public static void main(String[] args) {
       AB a = new AB(30,40);
       
	}
}
