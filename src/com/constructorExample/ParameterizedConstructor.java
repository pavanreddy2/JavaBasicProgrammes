package com.constructorExample;


public class ParameterizedConstructor {
	
	public static void main(String[] args) {
		
		Car car = new Car("Toyota", "HEXA 6", 2023);
		
		Car car1 = new Car("Ford","Ecosport", 2021);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		System.out.println("********************");
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		
	}
}
