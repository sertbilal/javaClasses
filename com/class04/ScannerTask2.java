package com.class04;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your age");
		int num1 = keyboard.nextInt();
		if (num1 >= 18) {
			System.out.println("You can get your Driving Licence");
		} else {
			System.out.println(
					"You cannot get your driving licence at this age;however,You may be eligable to get a driving permit");
		}

	}

}
