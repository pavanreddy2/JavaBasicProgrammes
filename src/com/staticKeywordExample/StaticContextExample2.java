package com.staticKeywordExample;

class StaticExample1 {

	static int m1() {
		System.out.println("m1-A");

		return 100;
	}

	static {
		System.out.println("SB");
	}

	static int i = m1();
}

public class StaticContextExample2 {

	public static void main(String[] args) {

		StaticExample1 e1 = new StaticExample1();

		StaticExample1 e2 = new StaticExample1();

	}

}
