package reviewArrayStringManip;
import java.util.Scanner;
public class Hw_97_String_Manip {

	public static void main(String[] args) {
/*Using Scanner class input string value. 
Print out the following: "The first 3 letters of ___ is ___"
For example, if the input is "banana", your output should be: 
"The first 3 letters of banana is ban".
 */
		Scanner input=new Scanner(System.in); 		
		System.out.println("Enter a word that contains at least 3 words");
		String str=input.next();
		System.out.println("The first 3 letters of "+str+" is "+str.substring(0, 3));
		
		
		
	}

}
