package com.class7;

public class IncrementAndDecreemnt {

	public static void main(String[] args) {
		int a=10;
		a=a=1; //assignment
		a+=1; //shorthand assignment
		
		System.out.println(a); //12
		a++; //increment operator
		System.out.println(a);
		
		
		int b=10;
		b-=1;
		b--; //decrement operator
		System.out.println(b);
//With increment and decrement &  operators can be used only with variables
		
		int c=23;
		c++;
		//1++
		//1++; compiler error invalid argument
	}

}
