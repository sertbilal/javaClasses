package com.class08;

public class Task2 {

	public static void main(String[] args) {
		// write a code to find the sum of even&odd numbers 
		//from range 1-20
		//expecting 2 outputs
		//sum for odd nums=..
		//sum for even nums=..
		//int sum1, sum2;
		
		int sumEven=0;//=(i%2==0); 
		int sumOdd=0;//=(i%2!=0);
		
		for (int i=1; i<=20; i++){ 
			if (i%2==0) {
			sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+i;}
		}
	
		System.out.println("The total of all even# ="+sumEven);
		System.out.println("The total of all odd# ="+sumOdd);
		

			
			
	}

	}


