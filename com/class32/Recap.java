package com.class32;

public class Recap {

	public static void main(String[] args) {
		//to store single value
		int num=10;
		
		//to store multiple values 
		int [] array= {10,20,30};
		
		int [] arr=new int [3]; //burada kac index olacagini soyledigimiz icin 3 koyduk
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(arr[2]);
		
		for (int num1:arr) {
			System.out.println(num1);
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		Fruit f=new Apple();
		Fruit f1=new Banana();
		Object f2=new Orange();
		Object monkey=new Monkey();
		
		Object [] mixArray= {f,f1,f2,"Hello"};
		for (Object fr:mixArray) {
			System.out.println();
		}
		
	}
	}
class Monkey extends Object{
	
}

class Fruit extends Object{
	
}
class Apple extends Fruit{
	
}

class Orange extends Fruit{
	
}
class Banana extends Fruit{
	
}
