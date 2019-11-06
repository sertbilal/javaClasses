package com.classHw;
import java.util.Scanner;
public class Hw42 {
public static void main (String[]args) {
//	For you to do:
//
//		Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.
//
//		case: 1 will display January
//
//		case: 12 will display December
//
//		Anything outside of 12 will display "Invalid"
	
	 Scanner input=new Scanner(System.in);
	    System.out.println("Input a number between 1-12");
	    int month=input.nextInt();
	    String nameOfMonth;
	    switch (month) {
	      case 1:
	      nameOfMonth="January";
	      break;
	      case 2:
	       nameOfMonth="February";
	      break;
	      case 3:
	       nameOfMonth="March";
	       break;
	       case 4:
	        nameOfMonth="April";
	        break;
	       case 5:
	        nameOfMonth="May";
	        break;
	       case 6:
	        nameOfMonth="June";
	        break;
	       case 7:
	        nameOfMonth="July";
	        break;
	       case 8:
	        nameOfMonth="August";
	        break;
	       case 9:
	        nameOfMonth="September";
	        break;
	       case 10:
	        nameOfMonth="October";
	        break;
	       case 11:
	        nameOfMonth="November";
	        break;
	       case 12:
	        nameOfMonth="December";//System.out.println("December");Hoca kislatmadan bununla yapmis
	        break;
	        default:
	         nameOfMonth="Invalid"; //System.out.println("Invalid");
	         break;
	    }System.out.println(nameOfMonth);
}
}
