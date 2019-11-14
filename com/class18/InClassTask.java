package com.class18;

import java.util.Scanner;

/*
Create a method that will take 2 parameters as a numbers and prints which number is larger.
Create a method that will take a number and prints whether the number is even or odd.
Create a method that will print whether given String is palindrome or not.
 */
public class InClassTask {
	public static void main(String[] args) {
		
		InClassTask task1 = new InClassTask();
		task1.largerNumber(300, 300);
		task1.evenOrOdd(99);
		task1.evenOrOdd(10);
		task1.palindrome("hello");//argument
		task1.palindrome("madam");
	}
		//methodName (2 int type parameters)
	void largerNumber(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			System.out.println("The larger number is" + " " + firstNumber);
		} else if (firstNumber < secondNumber) {
			System.out.println("The larger number is" + " " + secondNumber);
		} else {
			System.out.println("Numbers are equal");
		}
	}
	
//	Scanner scan=new Scanner (System.in);
//	int number=scan.nextInt();
	
	void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("the number is even number");
		} else {
			System.out.println("the number is odd number");
		}
	}

	void palindrome(String word) {
        String reverse = "";
        for (int i =word.length() - 1; i >= 0; i--) {
              reverse = reverse + word.charAt(i);
        } 
        
		if (word.equals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
        }
    }
}
