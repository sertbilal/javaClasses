package com.class9;

import java.util.Scanner;

public class CopiedTask1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Enter a start number: ");
	    int s=sc.nextInt();
	    System.out.print("Enter and end number: ");
	    int e=sc.nextInt();
	    
	    int sumEven=0;
	    int sumOdd=0;
	    
	    
	    for( int i=s; i<=e ;i++) {
	    
	      if(i%2==0) {    
	         
	      sumEven=sumEven+i;
	      
	     
	    }else {
	        sumOdd=sumOdd+i;
	            
	         }
	    }    
	     System.out.println("The sum of even mumbers between the range is "+sumEven);
	     System.out.println("The sum of odd mumber between the range is "+sumOdd);

	}

}
