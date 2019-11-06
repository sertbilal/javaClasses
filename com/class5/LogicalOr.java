package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// 7 days a week
		// if day is 2 or 4 -->SDLC class
		// if day is 6 or 7-->Java Class
		// if day is 1 or 5--> No class
		// if day = 3-->review class
		int day = 4;
		if (day == 2 || day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6 || day == 7) {
			System.out.println("Java Class");

		} else if (day == 1 || day == 5) {
			System.out.println("No Class");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else {
			System.out.println("Not a valid day");
		}
		// 7 days a week
		// if day is T or Th -->SDLC class
		// if day is S or Su-->Java Class
		// if day is M or F--> No class
		// if day = W-->review class

		String weekDay = "Tuesday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLS Class");
		} else if (weekDay.equals("Saturday") || weekDay.contentEquals("Sunday")) {
			System.out.println("Java Class");
		} else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		} else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		} else {
			System.out.println("Not a valid day");
		}
	}

}
