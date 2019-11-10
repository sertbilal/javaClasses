package com.class08;

import java.util.Scanner;

public class BreakAndContinueInLoops {

	public static void main(String[] args) {
		// break keyword breaks/exits the loop
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("***********************");
		
		//continue; it will CURRENT iteration
		for (int i=1; i<=5; i++) {
			if (i== 3|| i==4) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("************************");
		
		//I want to print nums from 1 to 20 except 5,6,7
		
		
		for (int a=1; a<=20; a++) {
			if (a==5 || a==6 || a==7) {
				continue; //skip edip saymaya devam ediyor
			}
			System.out.print(a+" ");
			
		for (int b=1; b<=50; b++) {
			if (b%3==0) {
				continue;
			} System.out.println(b);
	
	}

}}}
