package com.interviewQuestions;

public class SwapWithoutTemporaryVariable {

	public static void main(String[] args) {
		{
//	Q1-A Write a program to swap 2 numbers without a temporary variable? 

			int a = 10;
			int b = 20;
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("After swaping:" + " a = " + a + ", b = " + b);

//	Q1-B Swap 2 strings without a temporary variable?
			String str1 = "Hello";
			String str2 = "Welcome";

			str1 = str1 + str2;// HelloBye
			str2 = str1.substring(0, str1.length()-str2.length());// Hello
			str1 = str1.substring(str2.length());
			
			System.out.println("The value of str1  "+str1);
			System.out.println("The value of str2  "+ str2);
		}
	}

}
