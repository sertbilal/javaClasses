package com.class02;

public class VariableDeclaration {
	
	public static void main (String[] args) { 
		
	//1. declaring variable num1 that will hold value of int and 
		//assigning value of 123 to it
		int num1=123;
		int num2=6767;
		int num3=786876;
		long num4=78687665675675l;  //when compieler gives you error, then put l at the end
		char num5='A';
		
		
		//
		
		
		
	//2. declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		n1=56;  //just a number could be any number
		n2=7676;
		n3=767;
		
	//3.declare all variables together and then assign value (declaration happens only once)
		int number1, number2, number3;
		number1=12;
		number2=15;
		number3=676;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable='^';
		
		System.out.println(myVariable);
		
		//from top to the bottom declare variable, assign value, and 
		
		number2=number1;//12
		System.out.println(number2);
		//number2=false;-->compile time error asking to change data type of
		//variable number2 to boolean
	}

}
