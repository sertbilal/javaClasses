package reviewArrayStringManip;
import java.util.Scanner;
public class Hw_103_Scanner_Print_Char_eachLine {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
		    char[] ch=word.toCharArray();
		    for(int i=0;i<ch.length;i++){
		    System.out.println(ch[i]);    
		  }		   
	}
}
