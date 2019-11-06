package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			System.out.println("I am outer loop");
			for (int j = 0; j <= 3; j++) {
				System.out.println("I am inner loop");
			}
		}

	}

}
