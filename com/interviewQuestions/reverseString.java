package com.interviewQuestions;

public class reverseString {

	public static void main(String[] args) {
		
		String d= "ismail harun turker mehmed bilal ahmed ridvan";
//		System.out.println(d.length());		
//		System.out.println(d.toCharArray());
//		System.out.println(d.subSequence(0,45));
		
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
	
		


	}

}
