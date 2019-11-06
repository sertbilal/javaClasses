package com.class9;

import java.util.Scanner;

public class CopiedTask2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int sn,un;
        sn=12;
        
        do {
            System.out.println("Guess the secret number between 1 and 20");
            un=scan.nextInt();
            if(un>sn) {
                System.out.println("The number you guessed is larger than the secret number");
            }else if(un<sn) {
                System.out.println("The number you guessed is smaller than the secret number");
            }
            
        }while(un!=sn);
            System.out.println("Congratulations!!. You got it!");
	}

}
