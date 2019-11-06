package com.class14;

public class InClassTasks {

	public static void main(String[] args) {
//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str= "Vildancigim seni cok seviyorum askim  ";
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		
//Create a String that should be combination of letters, numbers and special characters. 
//Find out how many alpha characters are there in the String.
		
		String str1="123fgsFeOanDLB*7cx6s6ac4c$%#";
		//char [] chr=str1.toCharArray();
		System.out.println(str1.replaceAll("[^a-zA-Z]", ""));
		
		
//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
//How would you find out how many sentences are in that String?
		String a="Is it saturday? "
				+ "Is it raining? "
				+ "Do we have a Java Class today?";
        String [] arr2 = a.split("\\?");//period is not considered regex
        for (String string:arr2) {
            System.out.println(string.trim());
        }
            System.out.println("The number of sentences in the"+
            " given string is:" + arr2.length);
        }
	        
			
		}

	


