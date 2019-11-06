package reviewClass;

import java.util.Scanner;

public class NestedIf3 {

	public static void main(String[] args) {
		// Write a program with one int value for salary and four String values for
		// different cars
		// If you make over 50000 a year, you may buy a brand new car otherwise you
		// should buy a used car.
		// For those you can afford a new car there are different price ranges
		// I want anything under 70k to be Audi A5
		// I want anything under 80k to be Mercedes-Benz
		// I want anything under 90k to be Jaguar
		// I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until
		// next year"

//		Scanner input=new Scanner (System.in);
//		int salary=input.nextInt();
//		String car,car1,car2,car3,car4;
//		car1="Audi";
//		car2="Mercedes";
//		car3="Jaguar";
//		car4="Tesla";
//		
//		System.out.println("What is your salary?");
//		if (salary>50000) {
//			System.out.println("You can buy a new car?");
//			if (salary>=50000 && salary<60000) {
//				car=car1;
//			}else if (salary>=600000 && salary<80000);
//			car=car2;}
//		}else if (salary>=80000 && salary<90000) 
//			{car=car3;;
//			}else if (salary>90000) {
//				car=car4;
//			
//			
//			}
//			
		Scanner input = new Scanner(System.in);
		System.out.println("What is your salary?");
		int salary = input.nextInt();
		String a = "Audi A5";
		String b = "Mercedes-Benz";
		String c = "Jaguar";
		String d = "Tesla";

		if (salary > 50000) {
			if (salary >= 60000) {
				System.out.println("With this salary you afford " + a);
			} else if (salary >= 70000) {
				System.out.println("With this salary you afford " + b);
			} else if (salary >= 80000) {
				System.out.println("With this salary you afford " + c);
			} else if (salary >= 90000) {
				System.out.println("With this salary you afford " + d);
			} else {
				System.out.println("Save up money and wait until next year");
			}
		} else {
			System.out.println("Sorry unfortunately you might want to buy a use car instead");
		}

	}

}
