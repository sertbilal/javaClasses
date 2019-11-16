package com.replitMethod_Objects;

/*Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 
Creating an object of the class Main and assign value of 2 to roll_no and name as "John"
Your program should print the following:
Name is John and roll number is 2*/
public class Main {
	
//	String name;
//	int roll_no;
//	public static void main(String[] args) {
//	    Main s = new Main();
//	    s.name = "John";
//	    s.roll_no = 2;
//	    System.out.println("Name is "+s.name+" and roll number is "+s.roll_no);
//	    }
/*create a class named 'Main' with specific attributes.
Create two objects in which you will be assigning the following values.
carColor='Black'
carModelYear=2019
carName='BMW'

carColor='White'
carModelYear=2018
carName='Toyota'

Car color is Black and car model year is 2019 and car name is BMW
Car color is White and car model year is 2018 and car name is Toyota
	 * 
	 */
//	String carColor, carName;
//	int carModelYear;
//	public static void main(String[] args) {
//	Main car1=new Main();
//	  car1.carColor="Black";
//	  car1.carModelYear=2019;
//	  car1.carName="BMW";
//	 
//	  Main car2=new Main();
//	  car2.carColor="White";
//	  car2.carModelYear=2018;
//	  car2.carName="Toyota";
//	System.out.println("Car color is "+car1.carColor +" and car model year is "+car1.carModelYear +" and car name is "+car1.carName );
//	System.out.println("Car color is "+car2.carColor +" and car model year is "+car2.carModelYear +" and car name is "+car2.carName );
//	}
	String breed, name, color;
	  
	
	public static void main (String[]args){  
	  Main dog1=new Main();
	  dog1.breed="Husky";
	  dog1.name="Oscar";
	  dog1.color="BlackWhite";
	  dog1.bark();
	  dog1.run();
	  dog1.play();
	  
	  Main dog2=new Main();
	  dog2.breed="Bulldog";
	  dog2.name="Tombish";
	  dog2.color="Black";
	  dog2.bark();
	  dog2.run();
	  dog2.play();
	  
	  Main dog3=new Main();
	  dog3.breed="Labrador";
	  dog3.name="Pamuk";
	  dog3.color="Red";
	  dog3.bark();
	  dog3.run();
	  dog3.play();
	 
	
	}


	void play() {
		System.out.println(breed+" can play ");
		
	}


	void run() {
		System.out.println(breed+" can run");
		
	}


	void bark() {
		System.out.println(breed+" can bark");
		
	}}
