package reviewArrayStringManip;

import java.util.Scanner;

public class Hw_104 {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
		    System.out.println("In:");
		    String word = inp.nextLine();
		    
		    char[] ch=word.toCharArray();
		    for(int i=0;i<ch.length;i++){
		      if (i%2==0) {
		    	  System.out.print(ch[i]); 
		      }  
		      }     
}}
//Inputs:String word;
//Write a for loop that will print out every other letter in a String, 
//starting with the first letter.These letters should be printed all on one line 
//with no space in between.
//Sample input/outputs
//In: hello   hlo
//In: SSyynnttaaxxTTeecchhnnoollooggiieess
//SyntaxTechnologies
 


