package com.programmes;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 40;
		
		boolean isFlag = true;

		for (int i = 2; i <= num / 2; i++) {   //i = 2; i <= 41/2 ==> i <= 20.5 ;i++// 19 <= 20.5 ==> 20<=20.5 ==> 21 <=20.5
			if (num % i == 0) { //15.5 % 15 == 0 ==> false ==> 15 % 
				isFlag = false;
				break;
			}

		}

		if (isFlag) {
			System.out.println(num + " :Is prime Number");
		} else {
			System.out.println(num + " :is Not prime Number");
		}
	}

}
