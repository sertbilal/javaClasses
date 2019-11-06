package reviewArrayStringManip;
//The code provided in your main method will take in 
//five Strings and save them into an array called arr.  
//Print out the first three letters of each element of array, one per line.  
//Note: every element of array is at least 3 letters long. 

import java.util.Scanner;

public class Hw_102 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++){
			arr[i] = input.nextLine();
			System.out.println(arr[i].substring(0, 3));
		}System.out.println();
		
//leave above alone!  write your code below
		//Instructor's solution
//		for(int j=0;j<arr.length;j++){
//			   if(arr[j].length()>=3)
//			   System.out.println(arr[j].charAt(0)+""+arr[j].charAt(1)+""+arr[j].charAt(2));
//			}
	}

}
