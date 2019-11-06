package com.classHw;
import java.util.Scanner;

//For you to do:
//Prompt user with a question: "Is it weekend?"
//If it is not a weekend --> subject="Manual testing"
//Otherwise --> subject="Java"
//
//Output: 
//"Today you will be learning ____"
public class Hw38 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 		System.out.println("Is it weekend?");
		 		boolean isWeekend = input.nextBoolean();
		 		String subject;
		 		if (!isWeekend) {
		 			subject = "Manual testing";
		 		} else
		 			subject = "Java";
		 	System.out.println("Today you will be learning   "+subject);
		 }}

