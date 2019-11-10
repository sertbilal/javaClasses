package com.class02;

public class ModulusOperator { 
	public static void main (String[] args) {
		//Division icin double ya da float u kullanabilirsin
		
		float num1=12.5f;
		float num2=3.5f;
		
		float div=num1/num2;
		System.out.println(div);
		
		
		int number1=13;
		int number2=2;
		int divOfIntegers=number1/number2;
		System.out.println(divOfIntegers);
		
		
		double d=12;
		System.out.println(d);
		
		//int i=12.5;  cannot convert from double
		
		//modules gives remaining of the division;
		
		int a=15;
		int b=6;
		
		int remainder=a%b;
		System.out.println(remainder);
		
		//Any arithmetic operations in Java will follow precedence rule division/multiplication, addition/subtraction
			
		int myNumber=8+8*2;
		System.out.println(myNumber);
		
		
	}

}
