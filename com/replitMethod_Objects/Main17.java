package com.replitMethod_Objects;
//Create a method with following specification:
//
//Return Type: char
//Method Name: getChar
//Parameters:
//String called "word"
//Integer called "index"
//
//Then write your logic on getChar method to Find the character in given String at given index number 
//
//Examples:
//getChar("hello",1) ==> 'e'
public class Main17 {
	static char getChar(String word,int index) {  
		
		char b = word.charAt(index);
		
		return b;
		}	
	public static void main(String[] args) {

		Main17 a = new Main17();
		
		char b = a.getChar("word",1);
		
	System.out.println(b);	
			
			
		}
}


