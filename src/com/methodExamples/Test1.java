package com.methodExamples;


class AB{
	

	//Concrete method//instance Method
	double add (int i, int j) {
		
		int result = i + j; 
		// 100 + 200  == 300 ==> Result should be int format.
		
		return (double)result;
		
		
	}

}
public class Test1 {

	public static void main(String[] args) {
			AB a = new AB();
			double result1 = a.add(300,600);
			
			
			System.out.println(result1);
				
	}

}
