package com.classHw;
import java.util.Scanner;
public class Hw48 {

	public static void main(String[] args) {
		 
			    Scanner input=new Scanner(System.in);
			    //String gender=input.next();
			    //int age=input.nextInt();
//			    if (age>25 && gender.contains("M")) {
//			      System.out.println("Man");
//			    } else if (age>25 && gender.contains("F"))
//			    {System.out.println("Woman");
//			    }else if (age<25 && gender.contains("M")) {
//			    	System.out.println("Boy");
//			    }else if (age<25 && gender.contains("F")) {
//			    System.out.println("Girl");
//			    }else System.out.println("Sistem Missing");
			    
			    String gender=input.next();	
			    int age=input.nextInt();
			    if (age>25) {
			    
				   if(gender.contains("M"))
				      {System.out.println("Man");}
				        if(gender.contains("F"))
				          {System.out.println("Woman");
				    }
				       
				    }else if (age<=25) 
				        if (gender.contains("M")) {
				    	System.out.println("Boy");
				    }else if (gender.contains("F")) {
				    System.out.println("Girl");}
			    //else {System.out.println("Sistem Missing");}

//**************Hocanin Cozumu**********************************	
//			    String gender = scan.next();
//			    int age = scan.nextInt();
//			   
//			          
//			      if( age > 25 ) // outer if
//			      {
//			        if( gender.equals("M")) {
//			                  System.out.println("Man");
//			              } else {
//			                  System.out.println("Woman");
//			              }
//			      } 
//			      else {
//			              if( gender.equals("M"))    
//			              {
//			                  System.out.println("Boy");
//			              } else {
//			                  System.out.println("Girl");
//			              }		    
			    
			    
			    
			    
	}		    
}
