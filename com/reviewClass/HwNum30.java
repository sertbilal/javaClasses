package com.reviewClass;

import java.util.Scanner;

public class HwNum30 {
	class Main {
		public void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter your age 18");
			int userAge = input.nextInt();
			if (userAge == 18) {
				System.out.println("You are eligible to vote");
			} else if (userAge > 18) {
				System.out.println("You are eligible to vote");
			} else {
				System.out.println("You are not eligible to vote");
			}

		}
	}

}
