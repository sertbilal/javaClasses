package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/*Ask user to enter their gender F or M
		 * based od the input provided
		 * if F--> Female
		 * if M--> Male
		 * Otherwise-->unknown
		 * 
		 * Switch case similar to if else
		 * Switch case is a vale base, if else is a condition base
		 * Limitation of switch case:
		 * 1)only works with byte short int char String
		 * 2)no relational or logical operators can be used
		 * 3)DAtat type of variable and case MUST be same
		 * 4)duplicate cases are not allowed
		 * 5)we need a break: to stop
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Please eneter your gender: F or M");
char gender=scan.next().charAt(0);
String userGender;

switch(gender) {
case 'F' :
	userGender="Female";
	break;
case 'M':
	userGender="Male";
	break;
default:
	userGender="Unknown";
	
}
System.out.println("Your gender is  " +userGender);

	}

}
