package com.staticKeywordExample;

class StaticExample {

	static {
		System.out.println("SB-static Example");
	}

	// static int j = 10;
	static int i = m1();
	// static int i = 100;

	static int m1() {

		System.out.println("m1-A");

		return 10;
	}
}

public class StaticContextExample {

	public static void main(String[] args) {
		StaticExample e1 = new StaticExample();

		// e1.m1();

		// System.out.println(e1.m1());

		// System.out.println(e1.i);

		// System.out.println(e1.m1());
	}

}
