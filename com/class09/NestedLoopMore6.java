package com.class09;

public class NestedLoopMore6 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
	
            for(int a=1; a<=5; a++) {
                for(int b=1; b<=a; b++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int a1=4; a1>=1; a1--) {
                for(int b1=1; b1<=a1; b1++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
    }

	}


