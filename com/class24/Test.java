package com.class24;

public class Test {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		System.out.println(child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		//child1.reciteQuran(); compiler gives error because
		//i did not use extend function from child 1 to 2
		Child2 child2 = new Child2();
		System.out.println(child2.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.sing();
		//child2.code();
		child2.reciteQuran();
		
		Parent parent = new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		parent.sing();
		//parent.reciteQuran();
		// parent.code(); compiler will give error

	}
	

}
