package com.classHw;

public class HwForLoop {

	public static void main(String[] args) {

//		int a= 10;
//	    for (int i=10; i>=2; i-=2 ){
//	    	System.out.print(i+",");
//	    	
//	}
//Create a for loop that prints out even numbers from 2 to 14
//Increment by 1 ONLY
//Must include the number 14 in the output 
//Output:  
//	    	2
//	    	4
//	    	6
//	    	8
//	    	10
//	    	12
//	    	14

//	 int a = 14;
//	    for (int i=2; i<=a; i++){
//	      if (i%2==0)
//	      System.out.println(i);
//	    }

//For you to do: 
//Create a for loop that prints out odd numbers from 5 to 22
//Increment by 1 example(i++)
//Must not include the number 22 in the output 
//Output:  
//			5
//			7
//			9
//			11
//			13
//			15
//			17
//			19
//			21
//			int a = 22;
//		    for (int i=5; i<=a; i++){
//		     if (i%2!=0)
//		      System.out.println(i);
//		    }
		
//		For you to do: 
//			Write a program that use for loop to prints multiples of 3 between 1 and 20 on one line.
//
//			Must not include the number 20 in the output 
//
//			Hint :
//			3*1=3 
//			3*2=6
//			3*3=9
//			3*4=12
//			3*5=15
//			3*6=18
//
//			Output:
//			3 6 9 12 15 18
//		 	int a=20;
//		    for (int i=3; i<a; i++ )
//		    	if (i%3==0)
//		    
//		    
//		    System.out.print(" "+i);
//		Instructor's Solution
//		for (int i = 1; i<=6; i++) {
//			System.out.print(i*3 + " ");
//		}
		//int a=20;
//	   
//		For you to do: 
//			Write a program that prints the string "It is year: " and the years between 2010 and 2019.
//
//			Must not include year 2019 in the output 
//
//			Hint: 
//
//			It is year 2011
//			It is year 2012
//			It is year 2013
//			.
//			.
//			.
//			It is year 2018
//
//			Output:
//			It is year 2011
//			It is year 2012
//			It is year 2013
//			It is year 2014
//			It is year 2015
//			It is year 2016
//			It is year 2017
//			It is year 2018
//		for (int y=2011; y<=2019; y++)
//		    System.out.println("Hey, it is year "+y);
		
		for (int i=10; i>=0; i--)
			if (i==0) {
				System.out.println("Happy New Year!");
			}else {
			System.out.println(i);}
			
	
		
		
	}
}
