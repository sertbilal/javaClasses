package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if number is btw 1-10-->this number is small if number is btw 11-100-->this
		 * number is medium if number is btw 101-1000-->this number is large any other
		 * number-->is out of the range
		 */
		int num = 200;
		if (num > 1 && num < 10) {
			System.out.println("This number is small");
		} else if (num >= 10 && num < 100) {
			System.out.println("This number is medium");
		} else if (num > 100 && num < 1000) {
			System.out.println("This number is large");
		} else {
			System.out.println("Number is out of our range");

		}

	}
}
