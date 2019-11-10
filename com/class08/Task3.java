package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		for (int a = 1; a <= 20; a++) {
			if (a == 5 || a == 6 || a == 7) {
				continue; // skip edip saymaya devam ediyor
			}
			System.out.print(a + " ");

			for (int b = 1; b <= 50; b++) {
				if (b % 3 == 0) {
					continue;
				}
				System.out.println(b);
			}

			for (int i = 3; i <= 50; i += 3) {
				System.out.print(i + " ");
			}
			System.out.println("-----------task2----------------");

			for (int b = 1; b <= 10; a++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("PLease apply for credit card");
				String credit = scan.nextLine();
				if (credit.equals("yes")) {
					break;
				}
			}
			System.out.println("Thank you!");

		}
	}
}
