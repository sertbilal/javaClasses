package com.class4;

public class RecapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23;
		num = 90;
		num -= 200;// -110=90=200
		num -= 110;
		num += 220;

		if (num > 0) {
			System.out.println(num + "   is a positive number");
		} else if (num == 0) {
			System.out.println("Value of num is " + num);
		} else {
			System.out.println(num + "   is a positive number");
		}
		// even or odd(7,8)
		int i = 134;
		if (i % 2 == 0) // or (i%2!=0) da ayni sonucu verir
		{
			System.out.println(i + "   is en even number");
		} else {
			System.out.println(i + "   is a positive number");
		}

	}

}
