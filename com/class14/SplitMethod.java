package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*.split()
		 * This method splits this string around matches of the given regular expression.
		 */
		
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help you prove your point.";
		
		String[] array=str.split(" ");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		String str1= "Today is Sunday. It's sunny day. And we are having java class";
        String [] arr2 = str1.split("\\.");//period is not considered regex
        for (String string:arr2) {
            System.out.println(string.trim());
        }
            System.out.println("The number of sentences in the"+
            "given string is:" + arr2.length);
        }
		
	}


	
