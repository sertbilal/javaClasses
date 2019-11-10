package com.class05;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		/*ask user to enter the month they were born
		 * bansed on the month define the season
		 * if user is born in jan, feb, dec-->winter
		 * if mar apr may-->spring
		 * if june jul august -->summer
		 * if sep oct nov --> fall
		 * Otherwise --> unknown
		 * at the end of teh program
		 * "you were born in________"
		 */
Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the month you born");
        String x = scan.nextLine();
        
        if (x.contains("jan")|| x.contains("feb")|| x.contains("dec")){
            System.out.println("you were born in winter");
        }
        
        else if (x.contains("mar")|| x.contains("apr")|| x.contains("may")){
            System.out.println("you were born in spring");
        }
        else if (x.contains("sep")|| x.contains("oct")|| x.contains("nov")){
            System.out.println("you were born in fall");
        }    
        else if (x.contains("jun")|| x.contains("jul")|| x.contains("aug")){
            System.out.println("you were born in summer");
        }
	}

}
