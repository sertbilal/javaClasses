package reviewClass;

import java.util.Scanner;

public class DeneMe {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your salary?");
		int salary = input.nextInt();
		String car1, car2, car3, car4;
		car1 = "Audi";
		car2 = "Mercedes";
		car3 = "Jaguar";
		car4 = "Tesla";
		
		if (salary > 50000) {
			System.out.println("you can buy a new car");
			if (salary >= 50000 && salary <= 60000) {
				System.out.println("You can get " + car1);
			} else if (salary >60000 && salary <= 80000) {
				System.out.println("You can get " + car2);
			} else if (salary > 80000 && salary <= 90000) {
				System.out.println("You can get " + car3);
			} else if (salary > 90000)
				{System.out.println("You can get " + car4);
				}//else System.out.println("Invalid Salary Entry");

		} else
			System.out.println("You should buy a used car");

	}
}
