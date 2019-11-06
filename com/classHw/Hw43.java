package com.classHw;
import java.util.Scanner;

public class Hw43 {
//	For you to do: 
//		Prompt user with questions: "Please enter your favorite car make"
//
//		if user enters  BMW -->  carOrigin = "german car"
//		if user enters  Toyota -->  carOrigin = " japanese car"
//		if user enters  Maserati -->  carOrigin = "italian car"
//		anything else besides those values --> carOrigin = "unknown" 
//		 
//		The output of your program should be:
//		"Your favorite car is ___"
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		  System.out.println("Please enter your favorite car make");
		  String car=input.next();
		  String carOrigin;
		  if (car.equals("BMW")){
		    carOrigin="german car";
		  }else if (car.equals("Toyota")){
		    carOrigin="japanese car";
		  }else if (car.equals("Maserati")){
		     carOrigin="italian car";
		  }else {
		     carOrigin="unknown";
		  } System.out.println("Your favorite car is "+carOrigin);
			
//		  (This is instructor's solution)***********
//			Scanner myScanner; 
//			String car;
//
//			myScanner = new Scanner(System.in);
//			System.out.println("Please enter your favorite car make");
//			car = myScanner.nextLine();
//			String carOrigin;
//
//			switch (car) {
//			case "BMW":
//				carOrigin = "german car";
//				break;
//			case "Toyota":
//				carOrigin = "japanese car";
//				break;
//			case "Maserati":
//				carOrigin = "italian car";
//				break;
//			default:
//				carOrigin = "unknown";
//			}
//			
//			System.out.println("Your favorite car is " + carOrigin);

	}

}
