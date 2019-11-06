package com.class4;

import java.util.Scanner;

public class ReplQ29 {

	public static void main(String[] args) {
		Scanner bilo = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = bilo.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	if(name.equals("Chen")){ 
	  	  System.out.println("teacher");
	  	}else {
	  	  System.out.println("student");
	  	}
/*
 * Hint: for your if condition use if(name.equals("Chen")) - 
 * we haven't study it yet, but this is code to compare Strings. 
 * We will cover this topic soon. 
 */
	}

}
