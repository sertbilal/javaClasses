package reviewClass;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Eneter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the operator");
		String operator = scan.next();
		System.out.println("Eneter in second number");
		
		int num2 = scan.nextInt();

		if (operator.contentEquals("+")) {
			System.out.println(num1 + num2);
		} else if (operator.contentEquals("-")) {
			System.out.println(num1 - num2);

		} else if (operator.contentEquals("*")) {
			System.out.println(num1 * num2);

		} else if (operator.contentEquals("/")) {
			System.out.println(num1 / num2);

		} else {
			System.out.println("You enetered invalid operator or a number in one of the spaces above");
		}

	}

}
