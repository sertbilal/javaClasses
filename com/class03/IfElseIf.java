package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		}
		// else {System.out.println("Num1 is smaller than num2");}

		else if (num1 == num2) {
			System.out.println("Num1 is equal to num2");
		}

		else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 7;
		if (day == 1) {
			System.out.println("Today is Monday. I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. I have SDLC class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday. I have Java review Class");
		} else if (day == 4) {
			System.out.println("Today is Thursday. I have SDLC Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday. Weekend is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday. My favorite coding day");
		} else if (day == 7) {
			System.out.println("I love spending Sundays at Syntax");
		} else {
			System.out.println("I dont know this day");
		}
		System.out.println("I am done with if statement"); // else ile islem biter
															// else if ile condition vermeye devam edersin
		// else den sonra yazdigin her islem kendi icinde degerlendirilir
	}
}/// ctrl+shift=f--> for Windows command+shift+f for mac will organize your codes
