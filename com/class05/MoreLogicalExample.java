package com.class05;

import java.util.Scanner;

//to import shortcut cmd+shift+O

public class MoreLogicalExample {

	public static void main(String[] args) {
		/*
		 * ask user to enter daily sales based on the sale range we want to give
		 * commission to the sale representative if sale is less than 100 --> commission
		 * 10% sales is between 100-200--> commission of 20% etc.
		 */
		Scanner scan;
		double salesAmount;
		double commission;
		scan = new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount = scan.nextDouble();
		if (salesAmount >= 1 && salesAmount < 100) {
			// instead of using this System.out.println("Your commission is 10%");
			// lets give user 10% commission of a sale
			commission = salesAmount * 0.1;
		} else if (salesAmount >= 100 && salesAmount < 200) {
			// lets give user 20% commission of a sale
			commission = salesAmount * 0.2;
		} else if (salesAmount >= 200 && salesAmount < 500) {
			// lets give user 30% commission of a sale
			commission = salesAmount * 0.3;
		} else if (salesAmount >= 500) {
			// lets give user 50% commission of a sale
			commission = salesAmount * 0.5;
		} else {
			commission = 0;
		}
		System.out.println("Based on the sales of your commission is " + commission);
	}

}
