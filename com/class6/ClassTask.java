package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {

		/*
		 * ask user to enter the month they were born bansed on the month define the
		 * season if user is born in jan, feb, dec-->winter if mar apr may-->spring if
		 * june jul august -->summer if sep oct nov --> fall Otherwise --> unknown at
		 * the end of teh program "you were born in________"
		 */

		String month;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter the month that you were born");
		month = scan.nextLine();
		String season=month;

		
		if (month.equals("January") || month.equals("February") || month.equals("December"))
			season = "Winter";
		else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else
			System.out.println("Invalid entry");
		
		System.out.println("you were born in  " + season);
	}

}
