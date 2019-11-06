package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// Say good morning 5 times
		//for (initialize; test condition; incrementation)
		for (int i = 0; i <= 4; i++) {
			System.out.println("Good Morning");
		}
		
		//print numbers from 1-10;
		for (int i=1;i<=10; i++) {
			System.out.println(i);
		}
		//print numbers from10-1
		
		for (int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		for (int i=0; i<=50; i+=5) {
			System.out.println(i);//5 10 15 20
		}
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");	
		}
		for (int i=101; i>=1; i--) {
			System.out.println(i);
		}
		for (int i=20; i>=1;i--) {
			if (i%2==0) 
			System.out.println(i);
		}	
		for (int i=20; i<=50; i++) {
			if (i%2==1)
				System.out.print(i+" ");		
		}
		int sum=0;
		for (int i=1;i<=5; i++) {
			sum=sum+i;
			System.out.print(sum+ "+");
		}
		System.out.println();
		System.out.println(sum);//
		
		System.out.println("************************");
		//what is he output
		 int sumAll=0;
		 for (int i=0; i<=20; i+=5) {
			 sumAll=sumAll+i;
		 }
		 System.out.println(sumAll);
		 
		 System.out.println("************************");
		 //what is the output
		 
		 int total=2;
		 for (int y=1; y<=3; y++) {
			 total=total*y;//2=2*1
		 }
		 System.out.println(total);
	}

}
