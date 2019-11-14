package com.reviewMethodsClass;

public class Baby {
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	
	void talk() {
		System.out.println("Bla bla bla");
	}
	void walk (int times) {
		for (int i=0; i<times; i++)
		System.out.println("Crawl");
	}
	
	void cry() {
		System.out.println("Cry every minute");
	}

}
