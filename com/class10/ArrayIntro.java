package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {// ARRAYS must be of the same type boolean int etc.

		int a;
		a = 10;

		int a1 = 10;

		// 1st way

		int[] b;// declare an array-->preferred way

		int c[];// this way works too

		b = new int[4]; // initialize an array
		// 2nd Way-->all in 1 line)declaration& initialization)
		int[] array = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		// access value from an array
		System.out.println(array[2]);

		// lets create an array that will store classes
		String[] classes = new String[4];
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "ManuelTesting";
		classes[3] = "GIT";
		System.out.println("today we have a " + classes[0] + " class");

		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		// how can change value from 1 to 100
		nums[0] = 100; // just reassign!!!
		System.out.println(nums[0]);
		System.out.println(nums[0] + nums[2]);// 100+3

		String[] names = new String[3];
		names[0] = "Diana";
		names[1] = "Seda";
		names[2] = "jaime";
		//try names[3] = "olga";//when you indicate 3 at the top and create another one here, 
		//it will give error when you try to print it
		//System.out.println(names[3]);
		
		int[] numbers=new int[4];//another example of possible complication here
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);//when you do that output will be default value which is 0
		
		double[] numbers1=new double[4];//another example of possible complication here
		numbers1[1]=100;
		numbers1[3]=200;
		System.out.println(numbers1[0]);
		
	}

}
