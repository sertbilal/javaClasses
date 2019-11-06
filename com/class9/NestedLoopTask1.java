package com.class9;

import java.util.Scanner;

public class NestedLoopTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sp, ep;
		System.out.print("Please enter starting point: ");
		sp = input.nextInt();
		System.out.print("Please enter ending point: ");
		ep = input.nextInt();

		int sumEven = 0;
		int sumOdd = 0;
		if (sp <= ep) {
		for (int i = sp; i <= ep; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;

			}

		}
		System.out.println("The sum of even numbers is "+sumEven);
		System.out.println("The sum of odd numbers is "+sumOdd);
		} else {//if 1num >2 num 
			System.out.println("Please enter start# less then end number");
	
}}}
