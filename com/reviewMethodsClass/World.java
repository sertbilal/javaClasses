package com.reviewMethodsClass;

public class World {
	public static void main (String[]args) {
		
	Baby baby1=new Baby();
	baby1.firstName="John";
	baby1.lastName="Doe";
	baby1.gender='M';
	baby1.hairColor="Yellow";
	baby1.weight=7;
	
	System.out.println(baby1.firstName);
	
	System.out.println(baby1.gender);
	
	baby1.walk(2);
	
	Baby baby2=new Baby();
	baby2.cry();
	
	baby2.firstName="Ann";
	baby2.lastName="Smith";
	baby2.hairColor="Brown";
	baby2.gender='F';
	baby2.weight=6;
	
	baby2.cry();
	baby2.talk();
	System.out.println("Full name of baby 2 is "+baby2.firstName+" "+ baby2.lastName);

	
		
		
		
	}
}
