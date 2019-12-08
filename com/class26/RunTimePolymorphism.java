package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		//Creating an object on parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();
		
		//Widening
		double d=90;
		//Narrowing
		int i=(int)1.99;
		System.out.println("---------------------");
		
		//Non Primitive Typecasting 
		//Widening -> creating an object of the class 
		//and giving reference to the Parent class
		
		Animal obj=new Cat();
		//narrowing 
		//Cat  obj2=new Animal(); --> Cannot convert from animal to cat
		obj.eat();
		obj.sleep();
		//obj.meow (); compiler error --> method won't be available 

	}

}
