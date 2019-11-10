package com.class07;
import java.util.Scanner;
public class Homework2 {

	public static void main(String[] args) {
		// you need to ask user to pay for coffee
		// you need to keep asking user to pay until entered the price=5
		// after user paid then say"Enjoy your coffee!"

		Scanner scan = new Scanner(System.in);

		int price;

		do {
			System.out.println("Please pay for coffe");
			price = scan.nextInt();
			price++;

		} while (price <= 5);
		{
			System.out.println("Enjoy your coffee!!");
		}

	}

}
