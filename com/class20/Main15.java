package com.class20;
//Complete method with the following specs:
//
//Returns: an integer
//Method Name: addTwo
// Parameters: 
//An integer called "x"
//An integer called "y"
//
//Have the method do an addition function with the two parameters, makes sure output is 25. 
//also make sure you are passing 2 arguments when you calling the method.
//
//Output:
//25
public class Main15 {
	int addTwo(int x,int y)
	{
		return x+y;
	}
	
	//test case below (don't change):
	public static void main(String[] args){
	  Main15 main=new Main15();
		System.out.println(main.addTwo(20,5)); //should be 7
	}
}

