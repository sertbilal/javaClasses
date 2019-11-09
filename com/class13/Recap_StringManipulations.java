package com.class13;

public class Recap_StringManipulations {

	public static void main(String[] args) {
		String city="Fairfax";
        //String city1=“FAirfax”;
//        System.out.println(city.isEmpty());
//        System.out.println(city.length());
        
        int [] a1= {12,32,55,77};
        System.out.println(a1.length);
        System.out.println(city);
        String city2=city.toUpperCase();
        System.out.println(city2);
        
		String a ="Hello";
        String b ="Hello";
        
        System.out.println(a.contentEquals(b));
        System.out.println(a==b);
        
        String x = new String ("Bye");
        String y = new String ("Bye");
        
        System.out.println(x.contentEquals(y));
        System.out.println(x==y);
        
        
        
/*.equals : compares the values (are both of them have the same sequence of char? )
*    ==   : compares the objects   (are these same objects? )
*in case str3==str4   --> false = because pointing to different places in memory, 
*despite the fact they have the same content? YES
*/
	}

}
