package com.class23_Constructors_1;

public class BetterCar {
	/* we want to build make as Toyota that will have different models and color *
 	 */

 	public static String make;
 	public String model;
 	public String color;
 	public int speed;
 	public int doors;


	public BetterCar(String string, String string2, int i, int j) {
	}

	public static void main(String[] args) {
		make="BMW";
		//compiler will give an error, we have to pass values when we build an Object
		//those values will be passed as arguments to the constructor
		//through constructor instance variables will get initialized
		//BetterCar bcar1=new BetterCar();
		BetterCar bcar1=new BetterCar("X5", "Blue", 400, 2);
		bcar1.getDetails();
	}

	public void getDetails() {
		System.out.println("I build " + color + " " + make + " " + model);
}
}