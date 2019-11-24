package com.reviewClass;

import java.util.Scanner;

public class CalisCalis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int ue;
		do {
			System.out.println("Enter a number between 1-21");
			ue = input.nextInt();
			if (ue<8 && ue>8) {
			System.out.println("Please keep trying");
			}

		} while (ue != 8);
		System.out.println("Congrats!!!");

	}

}
