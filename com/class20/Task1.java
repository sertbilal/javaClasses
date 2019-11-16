package com.class20;
/*
 * Create a method that will take 1 parameter as a String and return reversed
 * String. Method should be visibly only within same package.
 */
public class Task1 {
	private String method(String word) {
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--)
			reversed += word.charAt(i);
		return reversed;
	}
	public static void main(String[] args) {

		Task1 tsk1 = new Task1();
		System.out.println(tsk1.method("reversed string"));
	}
}

