package com.classHw;

public class HwForLoop69 {

	public static void main(String[] args) {
//For you to do: 
//Write a program to print out the pattern: 
//    1
//   22 
//  333 
// 4444 
//55555
//Hint: For loop can have more than one loop nested in it. 	
		
//		for (int i=1; i<=5; i++) {//row
//		      for (int j=0; j<i; j++){//column
//		        System.out.print(i);
//		      }System.out.println();
		//Instructor's Solution
		for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= (5 - i); j++ ) { 
	        System.out.print(" "); }
	        
	        for (int k = 1; k <= i; k++) {
	        System.out.print(i);
	        }
	        System.out.println();
	}

}}
