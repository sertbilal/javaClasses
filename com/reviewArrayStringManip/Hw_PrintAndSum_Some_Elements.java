package com.reviewArrayStringManip;

public class Hw_PrintAndSum_Some_Elements {
//Write a program that will print the sum of all elements in column 
//with index 1 in a 2-D int array. 
	public static void main(String[] args) {
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		int colSum=0;
		for (int i=0; i<a.length; i++){
		  for (int j=0; j<a[i].length; j++) {  
		    if(j==1) {
		    	colSum= a[i][j]+colSum;
			  } 
	}
}System.out.println(colSum);
//Instructor's Solution************************************
//int column = 1;
//int sum = 0;
//		for (int row = 0; row < a.length; row++) {
//			sum += a[row][column];		
//		}	System.out.println( sum );
		
	}}
