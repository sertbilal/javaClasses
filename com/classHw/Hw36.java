package com.classHw;

import java.util.Scanner;

public class Hw36 {

	public static void main(String[] args) {

//		Scanner scan1;
//		boolean loan;
//		int creditScore;
//		String eligibility;
//
//		scan1 = new Scanner(System.in);
//		System.out.println("Do you need a loan?");
//		loan = scan1.nextBoolean();
//
//		if (loan) {
//			System.out.println("What is your credit score?");
//			creditScore = scan1.nextInt();
//			if (creditScore < 600) {
//				eligibility = "Not eligible";
//			} else if (creditScore >= 600 && creditScore <= 700) {
//				eligibility = "Maybe eligible";
//			} else if (creditScore >= 701 && creditScore <= 800) {
//				eligibility = "Eligible";
//			} else {
//				eligibility = "Definitely eligible";
//			}
//		} else {
//			eligibility = "Unknown";
//		}
//		System.out.println("The eligibility is " + eligibility);

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two strings");
		String word1 = input.next();
		String word2 = input.next();
		System.out.println("Please enter two numbers");
		int num1 =input.nextInt();
		int num2= input.nextInt();

		if (word1.equals(word2) && num1 == num2) {
			System.out.println("AND");
		} else if (word1.equals(word2) || num1 == num2) {
			System.out.println("OR");
		} else if (!(word1.equals(word2)) && num1!= num2) {
			System.out.println("NONE");
		}else 
			System.out.println("Invalid");

		

	}
}
