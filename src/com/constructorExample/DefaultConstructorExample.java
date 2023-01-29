package com.constructorExample;

public class DefaultConstructorExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setMake("Tayota");
		car.setModel("Hexa");
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());

	}

}
