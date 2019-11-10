package com.class04;

import java.util.Scanner;

public class ScannerReplAss2 {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age?");
		int userAge = age.nextInt();
		//int ageOutput = userAge + 10;
		System.out.println("Your age after 10 Years is  " + (userAge+10));

	}

}
