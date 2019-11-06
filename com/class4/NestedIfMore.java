package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		/*
		 * check age, if age is less than 16--> you are too young to drive otherwise,
		 * you are eligible to drive & we will check if you are older than 18--> you can
		 * get driving licence and if not you can get learner permit
		 */

		int age = 55;
		if (age < 16) {
			System.out.println("You are too young to drive");
		} else {
			System.out.println("You are eligible to drive");
			if (age >= 18) {
				System.out.println("You can drive alone");
			} else {
				System.out.println("You need your parents next to you to drive");
			}
		}
		System.out.println("-----------------------------------");
		/*
		 * We need to check if student completed the quiz if yes--> good job, if not-->
		 * not good if they completed we will check score: If more than 90--> you got an
		 * A if more than 80--> you hot a B anytyhing below--> you should study more
		 */

		boolean quiz = true;
		int score = 80; //Scor u degistir sonuclari gor
		if (quiz) {
			System.out.println("Good Job that you tried to take the quiz");
			if (score >= 90) {
				System.out.println("You got an A");
			} else if (score > 80) {
				System.out.println("You got a B");
			} else {
				System.out.println("You should study more");
			}
		} else {
			System.out.println("Not Good!!!");
		}
	}

}
