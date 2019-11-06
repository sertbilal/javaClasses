package com.class4;

public class NestedIf {

	public static void main(String[] args) {

		boolean b = true;
		boolean classToday = false; // T/F larla oyna degismeleri output tan gor
		if (b) {
			System.out.println("Hello");

			if (classToday)
				System.out.println("Hello My Friend");
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am continues code");
		/*
		 * Nested if ler tek parantezin icine yaziliyor unutma!!! Ayri parantez acarsan
		 * Nested olmuyor
		 */
	}

}
