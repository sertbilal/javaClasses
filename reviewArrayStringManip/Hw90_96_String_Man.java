package reviewArrayStringManip;

public class Hw90_96_String_Man {

	public static void main(String[] args) {
//Create a String named "name" and assign the value "Timmy" to it. 
//Find out how many characters are there in the given String. 
		String name="Timmy";
		System.out.println(name.length());
//Create a String named s1 = "hello"  check weather string is empty or not
//Create a String named s2 = ""  check weather string is empty or not		
		String s1="hello";
		String s2="" ;
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
//Create first String named str1= syntaxsolutions and convert into SYNTAXSOLUTIONS 
//Create first String named str2=  SYNTAXSOLUTIONS and convert into syntaxsolutions
		String str1= "syntaxsolutions";
		System.out.println(str1.toUpperCase());
		String str2="SYNTAXSOLUTIONS";
		System.out.println(str2.toLowerCase());
//Validate if the string ends with "u" prints the Boolean value accordingly.
//Validate if the string ends with "world" prints the Boolean value accordingly.
//Validate if the string ends with "are" prints the Boolean value accordingly.
//Validate if the string ends with "you" prints the Boolean value accordingly.
		String s11="hello how are you";
		System.out.println(s11.endsWith("u"));
		System.out.println(s11.endsWith("world"));
		System.out.println(s11.endsWith("are"));
		System.out.println(s11.endsWith("you"));
//Print out the position of the first occurrence of "c".
//Print out the position of the first occurrence of " ".
//Print out the position of the first occurrence of the variable target1.
//Print out the position of the first occurrence of the variable target2.
//Note: the output should be one per line. 
		 String str = "abracadabra alakazam";
		    System.out.println(str.indexOf("c"));
		    System.out.println(str.indexOf(" "));
		    String target1 = "dab";
		    System.out.println(str.indexOf(target1));
		    String target2 = "ABRA";
		    System.out.println(str.indexOf(target2));
//Output 1: print str starting at index 5 and going till the end.
//Output 2:  print str starting at index 7 and ending at index 10.
//Output 3: print "harambe". This must not be a new string, must be from str.
//Output 4: print "t f". This must not be a new string, must be from str. 
//Note: all outputs should be one per line		    
		    String str11 = "laptops out for harambe";
		    System.out.println(str11.substring(5));
		    System.out.println(str11.substring(7, 10));
		    System.out.println(str11.substring(16));
		    System.out.println(str11.substring(10, 13));
//Print out the character in the 5th index of the String str.
//Print out the character in the 8th index of the String str.
//Print out the character in the 1st index of the String str.
//Print out the character in the 10th index of the String str.
//Note: all print statements should be on one line. 
		    String str0 = "boopity bop";
System.out.print(str0.charAt(5)+" "+str0.charAt(8)+" "+str0.charAt(1)+" "+str0.charAt(10));
		    

	}

}
