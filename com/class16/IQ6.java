package com.class16;

public class IQ6 {
	/*
	 * Write a Java Program to find whether a String is palindrome or not? if
	 * reversed string and original string are same --> string is palindrome mom,
	 * dad, madam, racecar, kayak, bob Logic: Step1: reverse the string Step2:
	 * compare 2 Strings: if strings are equal-> palindrome else --> not palindrome
	 */
	public static void main(String[] args) {

		String original = "kayak radar kayak";
		String reversed = "";
		// 5-1=4-1
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);// ""+k=k+a=ka+k
		}

		System.out.println(reversed);

		if (original.equals(reversed)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is NOT palindrome");
		}

	}
}


