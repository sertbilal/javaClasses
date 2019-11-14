package com.class17;

public class ObjectsOfComputer {

	public static void main(String[] args) {

		Computer comp1 = new Computer();
		comp1.brand = "Apple";
		comp1.name = "MacBook Pro";
		comp1.type = "Laptop";
		comp1.keyboard = "Backlit";
		comp1.mouse = "Trackpad";
		comp1.price$$$ = 2499;
		comp1.ramGB = 16;
		comp1.screenSize = 15;
		comp1.HdSizeSSD = 512;
		
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		
		comp1.playGames();
		comp1.watchMovie();
		comp1.javaCoding();
		System.out.println("===Creating 2 Object of a computer type===");
		Computer comp2=new Computer();
		comp2.brand="Dell";
		comp2.name="Dell 420";
		comp2.HdSizeSSD=125;
		
		comp2.javaCoding();
		comp2.watchMovie();
		comp2.playGames();
		

	}

}
