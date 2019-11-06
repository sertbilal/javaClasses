package com.class5;

public class InClassTask {

	public static void main(String[] args) {
		int day = 5;
		if (day > 0 && day < 6) {
			System.out.println("It is a weekday");

		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else
			System.out.println("Invalid day");

	}

}
