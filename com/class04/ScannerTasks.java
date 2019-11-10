package com.class04;

import java.util.Scanner;

public class ScannerTasks {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the amont you would like to loan");
		int num1 = keyboard.nextInt();
		if (num1 <= 200000) {
			System.out.println("You can get the loan");
		} else {
			System.out.println(
					"You CANNOT get the loan in this amount. How you dare to ask such amount of money you such a poor idiot");
		}

	}

}
