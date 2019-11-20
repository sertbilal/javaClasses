package com.replitMethod_Objects;
//Step1: Create three method with  two Parameters as int 
//Step2: Write the logic in methods to perform actions below:
//the first method for multiplication
//The second method for addition 
//The third method for subtraction
//Step3: call all methods
//1. for the addition method add two numbers to make 30 but put those numbers in the parameters
//2. for multiplication multiply two numbers to make 30 but put those two numbers in your parameters
//3. for Subtraction subtract two numbers to equal 20, with using parameters.
//Outputs:
//Addition 30
//Multiplication 30
//Subtraction 20
public class Main11 {
	void m1(int num1, int num2) {
		  System.out.println("Addition "+(num1+num2));
		}
		void m2(int num3, int num4) {
		  System.out.println("Multiplication "+(num3*num4));
		}
		void m3(int num5, int num6) {
		  System.out.println("Subtraction "+(num5-num6));
		}

		public static void main (String []args){
		  Main11 mm=new Main11();
		  mm.m1(20, 10);
		  mm.m2(15, 2);
		  mm.m3(30, 10);

		  
		}


		}
