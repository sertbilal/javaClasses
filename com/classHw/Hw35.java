package com.classHw;

import java.util.Scanner;

public class Hw35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean loan;
		int score;
		String elig;
		System.out.println("Do you need a loan?");
		loan = input.nextBoolean();
		if (loan) {
			System.out.println("What is your credit score?");
			score = input.nextInt();
			if (score <= 600) {
				elig = "Not eligible";
			} else if (score > 600 && score <= 700) {
				elig = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				elig = "Eligible";
			} else {
				elig = "Definitely eligible";
			}
		} else
			elig = "Unknown";

		System.out.println("The eligibility is " + elig);
	}
}
