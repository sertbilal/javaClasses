package com.interviewQuestions;

public class reverseString {

	public static void main(String[] args) {
//		System.out.println(d.length());		
//		System.out.println(d.toCharArray());
//		System.out.println(d.subSequence(0,45));	
		
		String d= "ismail harun turker mehmed bilal ahmed ridvan";

		
		String[] array=d.split(" ");
		//Reverse
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		
		
		System.out.println("-------------");
		//Normal Dongu
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//System.out.println(d.toCharArray());
		char[] darray=d.toCharArray();
		for(int i=darray.length-1; i>=0; i-- ) {
			System.out.print(darray[i]+" ");
		}
		System.out.println();
		for(int i=0; i<darray.length; i++ ) {
			System.out.print(darray[i]+" ");
		}
	}

}
