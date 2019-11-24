package com.reviewArrayStringManip;

import java.util.Scanner;

public class Hw_98_StringMan_Scanner {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String lang = input.nextLine();
		
		if (lang.contentEquals("Java")) { 
			System.out.println("Java is a programming language");	
		}else if(lang.contentEquals("C")) {
			System.out.println("C is a procedural programming language");
		}else if(lang.contains("C++")) {
			System.out.println("C++ is a middle-level programming language");
		}else {
			System.out.println("Doesn't match any programming language");
		}

	}

}
