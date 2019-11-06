package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		/*
		 * ask user to enter boolean value for sale if no sale-->I am not shopping if
		 * sale--> check the price of the item based on the amount we will have to
		 * calculate the price after discount if price <20--> apply 10% if between
		 * 20-100 --> 20% if between 100-500-->30% anything -->50%
		 * 
		 * After discount ____the price of the item reduce from___to___
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there any sale: True or False");
		boolean sale = scan.nextBoolean();
		if (!sale) {
			System.out.println("I am not shopping");
		} else {
			System.out.println("What is the actual price");
		}
		int amount = scan.nextInt();
		double discount = 0;
		if (amount <= 20) {
			discount = amount * 0.10;
		} else if (amount >= 20 && amount <= 100) {
			discount = amount * 0.20;
		} else if (amount >= 100 && amount <= 500) {
			discount = amount * 0.30;
		} else if (amount > 500) {
			discount = amount * 0.50;
		} else {
			System.out.println("Invalid");
		}
		double discounted = amount - discount;
		System.out.println("After discount, the price of the item reduces from " + amount + " to " + discounted);
	}
}
