package com.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// Task 1 in Calss PPT lerdeki assignment Task 2 yi PPT lerden al yap
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card ? true or false");
		boolean cc = input.nextBoolean();
		if (cc) {

			System.out.println("What is the balance on your credit card?");
			int balance = input.nextInt();

			if (balance > 1000) {
				System.out.println("Please pay off your balance");
			} else {
				System.out.println("You can spend more money");
			}
		} else {
			System.out.println("Would you like to apply for credit card?");
		}
	}
}
