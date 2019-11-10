package com.class05;

import java.util.Scanner;

public class InClassTask2 {

	public static void main(String[] args) {
		System.out.println("Please enter your height");
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		if (height < 5) {
			System.out.println("You are short");
		} else if (height == 5 || height == 6) {
			System.out.println("You are medium");
		} else if ( height > 6) {
			System.out.println("You are tall");
		} else {
			System.out.println("Invalid");
		}
	}

}
