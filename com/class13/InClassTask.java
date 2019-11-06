package com.class13;

public class InClassTask {

	public static void main(String[] args) {
		
//Create a String and print it in reverse order (Sunday → yadnuS).
		String str="Sunday";
		char[] ch=str.toCharArray();
	    for(int i=str.length()-1; i>=0;i--){
	    	System.out.print(ch[i]);}
	    	
//	    	String str="Sunday";
//	        for(int i=str.length()-1;i>=0;i--) {//sunday de 6 karakter var o yuzden -1 kullandik
//	        									//Burada str.length()-1 yerine 5 koyabilirsiniz
//	        System.out.print(str.charAt(i));
//	        }
	  	System.out.println();	//alt alta yazsin diye koydum 
//	Create a String and if the String is not empty perform the following: 
//	if the String has an odd number of characters and has 3 or more characters, 
//	print the character in the middle of the String.
	    String str1="Hello";//1st Way
	    int middle=str1.length()/2;
	    if (!str1.isEmpty()) {
	    	if(str1.length()%2!=0 && str1.length()>=3) {
	    		System.out.println(str1.charAt(middle));
	    	}
	    }//2nd Way
	    String str2 = "Hello";
        
	       if (!str2.isEmpty()) {
	           if (str2.length() % 2  != 0) {
	               System.out.print(str2.charAt(str2.length()/2));
	           }else {
	           System.err.println("Error");
	       }
	        
	        
	       }
	}}


