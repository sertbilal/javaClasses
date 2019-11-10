package com.class04;

public class DiplomaPracticeIfMore {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 2.5;

		if (diploma) {
			System.out.println("Congratulations!!!");
			if (gpa >= 3.5)
				System.out.println("You are eligible for scholarship");
			else
				System.out.println("You should have studied harder");
		}

		else {
			System.out.println("Get a degree");
		}

		System.out.println("-----------------------------------");

		double rate = 5.8;
		double price = 11000;

		if (rate >= 4.5) {
			System.out.println("You will not buy a house");
		} else {
			System.out.println("You should consider buying a house");
			if (price >= 200000) {
				System.out.println("You need to take a loan");
			} else {
				System.out.println("You will pay cash");
			}
		}
	}
}
