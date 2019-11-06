package com.classHw;

public class Hw34 {

	public static void main(String[] args) {
		/*
		 *  Declare 4 int variables a, b, c and d. 
		 *  Your variable c is the result of addition of a & b. 
		 * Variables a & b should be more than d, and c should be more than d.
		 */
		int a,b,c,d;
	    a=5;
	    b=5;
	    c=10;
	    d=4;
	    if (a+b==c) {
	      System.out.println("True");
	    }else {
	      System.out.println("False");
	      }
	    
if (a>d && b>d ) {
	System.out.println("True");
}else if (c>d) {
	System.out.println("True");
}else {
	System.out.println("False");
}

//Hocanin cozumu
int a1=15;  
int b1=20;  
int c2=a+b; 
int d3=12;
System.out.println(a>d&&b>d);
System.out.println(c>d);
}
	}


