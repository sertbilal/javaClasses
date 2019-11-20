package com.replitMethod_Objects;
/*Step 1:create a method "PrintTwice" that should take a String as a single parameter
Step 2:Write the logic for that method print two statements twice 
Step 3: call the method ONLY once within the main method and pass the String value as 
"Don't make me say this twice!"
Output:
Don't make me say this twice!
Don't make me say this twice!
 */
class Main9 {
	  void PrintTwice(String s){
	    System.out.println(s);
	    System.out.println(s); }
	
	  public static void main(String[] args) {
	    
	    Main9 mm= new Main9();
	    mm.PrintTwice("Don't make me say this twice!");
	  }
	}

//	void PrintTwice () { Benim yaptigim*************
//	    System.out.println("Don't make me say this twice!");
//	    System.out.println("Don't make me say this twice!");
//	  }
//	  
//	  
//	  public static void main(String[] args) {
//	    Main9 mm=new Main9();
//	    mm.PrintTwice ();
//	    
//	    
//	  }}
	