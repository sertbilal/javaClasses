package com.class10;

public class TaskCapitalsAnotherWay {

	public static void main(String[] args) {
		String[] countries = { "Russia", "Turkey", "The U.S.A.", "Germany", "England"};
		
		
		int capital = countries.length;
		for (int a = 0; a < capital; a++) {
			
			switch(countries[a]) {
			
			case "Russia":
				System.out.println("Moskow");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "The U.S.A.":
				System.out.println("Washington D.C.");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "England":
				System.out.println("London");
				break;
				
			}
			
			
			
//			
//			if (countries[a].equals("Turkey")) {
//				System.out.println("I love Ankara");
//			} else if (countries[a].equals("Russia")) {
//				System.out.println("Moskow");
//			} else if (countries[a].equals("The U.S.A.")) {
//				System.out.println("Washington D.C.");
//			} else if (countries[a].equals("Germany")) {
//				System.out.println("Berlin");
//			} else if (countries[a].equals("England")) {
//				System.out.println("London");
//			} else {
//				System.out.println(countries[a]);
//
//			}

	}

}}
