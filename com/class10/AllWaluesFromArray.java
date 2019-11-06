package com.class10;

public class AllWaluesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
int size=animals.length;
for (int i=0; i<size; i++){
	System.out.println(animals[i]+ " ");	
}System.out.println("-------------");

//create an array to store 5 double values, print all elements in 1 line
				     // 0    1   2   3   4   5
double[] numberDouble= {1.5,2.5,3.5,4.5,5.5,6.5};
System.out.println(numberDouble[3]);
System.out.println("--------------");

double num=numberDouble.length;

for (int i=0; i<num; i++ ) {
	System.out.println(numberDouble[i]+" ");
	}
System.out.println("--------------");
}}
