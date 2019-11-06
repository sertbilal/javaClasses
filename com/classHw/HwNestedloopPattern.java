package com.classHw;

public class HwNestedloopPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //BUNU ANLAMADIM
//For you to do: 
//Write a program to print out the pattern: 
//			$$$$
//			$  $
//			$  $
//			$$$$
//	
//		for (int i=0; i<3; i++) {
//			System.out.println("$"+"$"+"$"+"$");
//			for (int j=0; j<i; j++) {
//				System.out.print("$");
//				
//				
//}
//				}System.out.println();
		
		for(int i=1; i<=4; i++){
		    for(int j=1; j<=4; j++){
		      if(i==1 || i==4 || j==1 || j==4){
		        System.out.print("$");
		      }else{
		       System.out.print(" ");
		     }
		     }System.out.println();
		   }
			}
		}
	


