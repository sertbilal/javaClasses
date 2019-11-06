package com.class4;

import java.util.Scanner;

public class ScannerReplAss3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  String name,phoneN,age,address;
		  System.out.println(" Enter your name");
		  name = input.next();
		  System.out.println(" Enter your mobile number");
		  phoneN =input.next();
		  System.out.println("Enter your age");
		  age=input.next();
		  System.out.println("Please enter your address");
		  address=input.next();
		  System.out.println("Your name is "+name+" ,your age is "+age+" your mobile number is "+phoneN+" and finally your home address is "+address);
	}

}
