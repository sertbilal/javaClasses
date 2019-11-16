package com.replitMethod_Objects;
/*1. create method and name as m1. Inside your method body add print statement as 
 * "m1 method implementation"
2. create another method and name as m2. Inside your method body add print statement as
 "m2 method implementation"
3. Call these two methods in the main method */
public class M1 {
	  
	   void m1(){
	     System.out.println("m1 method implementation");
	   }
	   void m2(){
	     System.out.println("m2 method implementation");
	   }
	  public static void main(String[] args) {
	    M1 statement= new M1();
	    statement.m1();
	    statement.m2();
	  }
	}