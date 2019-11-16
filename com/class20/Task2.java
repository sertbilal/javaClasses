package com.class20;

public class Task2 {
	private String method(String word) {
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--)
			reversed += word.charAt(i);
		return reversed;
	}
}
