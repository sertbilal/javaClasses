package com.class7;

public class DoWhileLoop {

	public static void main(String[] args) {
		//mostly used
		int num=10;
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
		//rare
		int num1=10;
		do {
			System.out.println("Bye");
			num1++;
		}while(num1<=7);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		//print even numbers from 20 to 50 using do while
		//1 way
		int num3=20;
		do {System.out.println(num3);
		num3+=2;
		}while (num3<=50 && num3%2==0);
		
		//2nd way
		int num4=20;
		do {
			if (num4%2==0) {
				System.out.println(num4);
				num4++;
			}
		}while (num4<=50);
				
	}
}
