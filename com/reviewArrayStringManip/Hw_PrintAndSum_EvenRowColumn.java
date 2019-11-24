package com.reviewArrayStringManip;
public class Hw_PrintAndSum_EvenRowColumn {
	public static void main(String[] args) {
		int[][] a = {
			//	  0  1  2  3
				{-5,-2,-3, 7},//0
				{ 1,-5,-2, 2},//1
				{ 1,-2, 3,-4} //2
			};	
		int colSum=0;
	for (int i=0; i<a.length; i++){	 
		for (int j=0; j<a[i].length; j++)
			if (i%2==0 || j%2==0) { 
			//System.out.print(a[i][j]+" ");
			colSum+= a[i][j];	 
	
}}System.out.println(colSum);
//Write a program that sums all numbers that are on even index 
//and on even row and prints it out.
//For example, in the following array, the numbers with parentheses would be summed:
//     0  1  2  3
//0   (4)(6)(3)(2)
//1   (4) 1 (2) 3
//2   (1)(2)(6)(9)
}}
