package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
//		// how to print numbers from 1 to 20
//		int i=1;
//		while (i<=20) {
//			System.out.println(i);
//			i++;
//		}
//		//i want to print numbers from 10 to 30 all in 1 line
//		
//		int y=10;
//		while(y<=30) {
//			System.out.print(y+"  "); //arasina bosluk koymak icin +" "
//			y++;
//		}
//		
//		//how to print values 10 to 1
//		int a=10;
//		while(a<=1) {
//			System.out.println(a);
//			a--;
//		}
//		//print values from 50 to 20
//		int b=50;
//		while(b>=20) {
//			System.out.println(b);
//			b--;
//		}
//		// To print all even numbers from 1 to 20 inclusive
//		//1st way increment value by 2
//		int z=2;
//		while (z<=20) {
//			System.out.println(z);
//			z+=2;
//		}
		//2nd way using modulus
//		int q=1;
//		while (q<=20) {
//			System.out.println(".");
//			if (q%2==0) {System.out.println(q);}
//			q++;
//		}
		//Print only odd number from 50 to 100
		
		int w=50;
		while (w<=100) 
		{ if(w%2==1)
			System.out.print(w);
			w++;
		}
		//print only even numbers from 100 to 1
		int f=1;
        
        while (f<=100 && f%2==1) {
         System.out.println(f);
         f+=2;
        }
		
	}

}
