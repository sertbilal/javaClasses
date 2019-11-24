package com.reviewArrayStringManip;

import java.util.Scanner;

public class Hw_99 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = input.next(); 
		   
		   if (browser.equalsIgnoreCase("ChRoME")){ //toLowerCase().equals("ChRoME") ile de olabilir
			     System.out.println("Proceed with Chrome browser");
			   }else if (browser.equalsIgnoreCase("FireFOX")){
			     System.out.println("Proceed with Firefox browser");
			   }else if (browser.equalsIgnoreCase("IE")){
			     System.out.println("Proceed with IE browser");
			   }else {
			     System.out.println("Invalid browser");
			   }
		
		   
		   //System.out.print(str1.substring(0, 27));
	}

}
