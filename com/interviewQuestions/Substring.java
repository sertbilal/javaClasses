package com.interviewQuestions;

public class Substring {

	public static void main(String[] args) {
		//Find out how many alpha characters present in a string?
		//How to find out the part of the string from a string?What is substring?  
		//Find number of words in string?
				
				String str1="%^&#Can*(#im*4#k&iz^4@3lar*753im5Ra&fi@a3v#eMe%@li&^h(*a";
				
				
				System.out.println("Alpha characters in str1 => "+str1.replaceAll("[^a-zA-Z]", ""));
				String str2=str1.replaceAll("[^a-zA-Z]", "");
				System.out.println("# of alpha characters in str1 => "+str2.length());
				
				System.out.println(str2.substring(11));
				System.out.println(str1.length());
				
				System.out.println(str1.replaceAll("\\w", ""));
			
	}

}
