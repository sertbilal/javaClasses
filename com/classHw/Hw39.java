package com.classHw;

import java.util.Scanner;

public class Hw39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		For you to do: 
//
//			By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
//
//			First Output: "Enter name of the instructor"
//
//			case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
//			case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
//			case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
//			case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
//
//			Other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter name of the instructor");
		String name=input.nextLine();

// Invalid instructor selected
		
		String instructor;
//		if(name.equals("Shiva")) {
//			instructor="Will take care of Java Assignment";
//		}else if (name.equals("Sandish")) {
//			instructor="Will take care of SDLC Assignment";
//		}else if (name.equals("Weqas")) {
//			instructor="Will take care of Selenium Assignment";
//		}else if (name.equals("Asel")) {
//			instructor="Will take care of every Assignment";
//		}else instructor=" Invalid instructor selected";
		//System.out.println(instructor);
		
		switch (name) {

		case "Shiva": 
			instructor = "Will take care of Java Assignment";
			break;
		case "Sandish" :
			instructor = "Will take care of SDLC Assignment";
			break;
		case "Weqas":
			instructor= "Will take care of Selenium Assignment";
			break;
		case "Asel":
			instructor="Will take care of every Assignment";
			break;
		default:
			instructor=" Invalid instructor selected";
		}
		System.out.println(instructor);
	}

}
