package com.classHw;

import java.util.Scanner;

public class Hw37 {

	public static void main(String[] args) {
//		For you to do:
//			Take 2 boolean inputs from a user:
//			 
//			"Are you thirsty?"
//			"Are you sleepy?"
//
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//
//			Output:
//			"Looks like you need ___ "

		Scanner input = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean isThirsty = input.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean isSleepy = input.nextBoolean();
		String drink;
		if (isThirsty && !isSleepy) {
			drink = "Water";
		} else if (isThirsty && isSleepy) {
			drink = "Coffee";
		} else if (!isThirsty && isSleepy) {
			drink = "Tea";
		} else
			drink = "Nothing";
	System.out.println("Looks like you need to drink   "+drink);
	
	}}

