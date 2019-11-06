package com.classHw;

import java.util.Scanner;

public class Hw46 {

	public static void main(String[] args) {
//		For you to do:
//Initialize an object for Scanner class, 
//condition is if object is greater than 400 create a nested if condition to see if object is less than or equal to 600. 
//If object is less than or equal to 600 have output say "don't calculate commission", 
//if object is greater than or equal to 600 then have output say "Value is too large". 
//For anything less than the value of 400 in the first condition please print "calculate commission".
//
//			Output:
//
//			If i enter 200 output should read "Calculate commission"
//
//			If i enter 400 output should read "Don't calculate commission"
//
//			If i enter 800 output should read "Value is too large"
//
//			Example:
//			Please enter a number
//			400
//			Don't calculate commission
		
		Scanner scan =new Scanner(System.in); //Instructor's Solution********************
		//int commission =800;
		System.out.println("Please enter a number");
		int sc= scan.nextInt();
		if (sc>=400) {
		 if(sc<=600) {
		  System.out.println("Don't calculate commission");
		 }else {
		  System.out.println("Value is too large");
		}
		}else {
		 System.out.println("Calculate commission");
		}
		//******************Benim yarim yamalak******************************//
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();

		if (num <=400) {
			System.out.println("calculate commission");
			if (num<=600);
		}else if (num >= 600)
				{System.out.println("Value is too large");
	
		} else if (num >= 400)
			System.out.println("calculate commission");

	}

}
