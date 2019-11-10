package com.class04;

import java.util.Scanner;

public class ScannerTask3 {
//TEMPERATURE 
	public static void main(String[] args) {
		Scanner temp=new Scanner(System.in);
		System.out.println("Please enter the your city");
        String city=temp.next();
        System.out.println("Please enter the temperature");
        int tempS=temp.nextInt();
        
        int tempC=(tempS-32)*5/9; //Bu formul Google da var al buraya formule et
        System.out.println("The temperature is in the city of "+ city+" is "+ tempC+ "C");

	}

}
