package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		//I want to print all values from an array
		//when value dog is Dog--> I love Dogs
		
		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
        int size = animals.length;
        for (int i=0; i<size; i++) {
            //if (i==1)
            if(animals[i].equals("Dog")) {
                System.out.println("I love dogs");        
            }else {
                System.out.println(animals[i]);

	}
            //Create an array of countries. While retrieving all values from an array print 
            //capital for each country.
           
            String[] countries = { "Turkey", "Russia", "The U.S.A.", "Germany", "England" };  
            int capital = countries.length;
            for (int a=0; a<capital; a++) {
                //if (i==1)
                if(animals[a].equals("Turkey")) {
                    System.out.println("I love Ankara");        
                }else {
                    System.out.println(animals[a]);
                }}}}}
