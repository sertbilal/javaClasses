package com.class10;

public class InClassTasksArrays {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country.

		String[] countries = { "Russia", "Turkey", "The U.S.A.", "Germany", "England", "Macca" };
		int capital = countries.length;
		for (int a = 0; a < capital; a++) {
			if (countries[a].equals("Turkey")) {
				System.out.println("I love Ankara");
			} else if (countries[a].equals("Russia")) {
				System.out.println("Moskow");
			} else if (countries[a].equals("The U.S.A.")) {
				System.out.println("Washington D.C.");
			} else if (countries[a].equals("Germany")) {
				System.out.println("Berlin");
			} else if (countries[a].equals("England")) {
				System.out.println("London");
			} else {
				System.out.println(countries[a]);

			}

		}
	}
}
