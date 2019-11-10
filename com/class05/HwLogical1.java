package com.class05;

import java.util.Scanner;

public class HwLogical1 {

	public static void main(String[] args) {

		Scanner scan;
		int quiz,midterm,finalScore; //tek tek yazinca da oluyor ex;int quiz = scan.nextInt(); gibi
		scan = new Scanner(System.in);
		System.out.println("Enter your quiz score");
		quiz = scan.nextInt();
		System.out.println("Enter your midterm score");
		midterm = scan.nextInt();
		System.out.println("Enter your final score");
		finalScore = scan.nextInt();

		int avarageScore = (quiz + midterm + finalScore) / 3;

		if (avarageScore >= 90) {

			System.out.println("Your grade is A");

		} else if ((avarageScore >= 70) && (avarageScore < 90)) {
			System.out.println("Your grade is B");
		} else if ((avarageScore >= 50) && (avarageScore < 70)) {
			System.out.println("Your grade is C");
		} else if (avarageScore < 50) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("Invalid");
		}

	}

}
