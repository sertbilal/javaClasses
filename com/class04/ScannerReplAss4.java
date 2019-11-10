package com.class04;

import java.util.Scanner;

public class ScannerReplAss4 {

	public static void main(String[] args) {
		boolean bool1, bool2, bool3;
		Scanner on = new Scanner(System.in);
		System.out.println("Input the boolean value");
		bool1 = on.nextBoolean();
		System.out.println("The value is " + bool1);
		System.out.println("Now input another boolean value");
		bool2 = on.nextBoolean();
		System.out.println("The second value is " + bool2);
		System.out.println("Now input another boolean value");
		bool3 = on.nextBoolean();
		System.out.println("Thank you for your answer which is : " + bool3 + "." + "  Have a nice day!!!");

		/*
		 * HOCANIN COZUMU Scanner s1 = new Scanner(System.in);
		 * System.out.println("Input the boolean value"); 
		 * boolean hello=s1.nextBoolean();
		 * if(hello){ System.out.println("The value is "+hello); }else{
		 * System.out.println("The value is "+hello); }
		 * 
		 */
	}

}
