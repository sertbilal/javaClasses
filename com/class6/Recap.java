package com.class6;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {

		/*
		 * declare the time
		 * 
		 * 
		 */
		int time = 20;
		String timeOfDay = null;

		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfDay = "Noon";
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "Evening";
		} else if (time > 20) {
			timeOfDay = "Night";
		} else {
			timeOfDay = "Invalid";
		}
		System.out.println("Time of the day is " + timeOfDay);
	}
}
