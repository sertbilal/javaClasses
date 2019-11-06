package com.class5;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);
		boolean traffic = true;
		if (!traffic) {// using ! we are reverting condition
			System.out.println("On time");
		} else {
			System.out.println("Late");
		}
		boolean isRain = true;
		if (!isRain) {
			System.out.println("Take an umbrella ");
		} else {
			System.out.println("Don't take an umbrella");
		}

		// lets compare 2 numbers using NOT (!) operator
		int num1 = 10;
		int num2 = 10;
		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
		if (!(num1 == num2)) {
			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}
		//if name is not Bilal or Vildan then you are not my friend
		String name="Bilal";
		String name2="Vildan";
		if (!(name.equals("Bilal")) || (name2.equals("Vildan"))) 
				{System.out.println("You are not my friend");
				}else {
					 System.out.println("You are my friend"); 
				}
			
		}
	}


