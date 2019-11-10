package com.class04;

public class NestedIfPractice {

	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 13; 

		if (isFriday) {
			System.out.println("Today is Friday");
		
				if (day == 13) {
						System.out.println("I will watch a scary Movie");
						} else {System.out.println("I will stay at home");}

		}else {
			System.out.println("Today is NOT Friday");
		}
	}
}
	


