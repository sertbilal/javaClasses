package com.interviewQuestions;

public class SwapWithoutTemporaryVariable {

	public static void main(String[] args) {
		{ 
//	        String str1 = "10"; 
//	        String str2= "5"; 
//	        System.out.println(str1.rep);
	        int x=1;
	        int y=0;
			x = x + y; 
	        y = x - y; 
	        x = x - y; 
	        System.out.println("After swaping:"
	                           + " x = " + x + ", y = " + y); 
	    } 
	} 

	}

