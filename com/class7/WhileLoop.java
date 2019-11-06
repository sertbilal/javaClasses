package com.class7;

public class WhileLoop {

	public static void main (String[]args) {
	int time=8;
    
    if(time<12) {
        System.out.println("Good morning");
    }
     while (time<12) {
         System.out.println("Good morning");
         time++;
     } 
     
     boolean workDay = true;
		int day = 1;
		while (workDay) {
		if (day == 6 || day==7) {
		workDay = false;
		System.out.println("I do not need a day of anymore");
		}else {
		System.out.println("I need a day off");
		}
		day++;
		}
}}
