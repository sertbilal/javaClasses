package com.replitMethod_Objects;
//Step1: Create method with 2 Parameters as int 
//Step2: Write the logic in that method in println statement to print hours : with minutes 
//Step3: Call the method
//
//Output: MUST BE!!!
//11:30
public class Main10 {
	
	public static void main (String []args) {
	
		
	Main10 mm=new Main10();
	mm.time(11, 30);


		
	}
	
void time (int hour, int min) {
    
    System.out.println(hour+":"+min);
  }
}