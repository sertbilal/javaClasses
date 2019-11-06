package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;
		// to find # of elements we use .length
		System.out.println(nums.length);// shows the number of the elements in array

						//    0         1         2        3
		String[] array = { "WInter", "Spring", "Summer", "Fall" };
		// I was born in
		System.out.println("I was born in " + array[2]);
		// array.lenght will return an integer
		int arraySize = array.length;
		System.out.println(arraySize);
		int[] score = { 80, 90, 70, 100 }; // easier or less code to do with array

	}
}
