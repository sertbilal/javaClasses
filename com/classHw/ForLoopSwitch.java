package com.classHw;

public class ForLoopSwitch {
//For you to do: 
//Note: You may also place the switch case statement inside a for loop. In each iteration 
//of the for loop, the switch case can be executed for each value in the range of for loop. 
//
//The x variable is incremented by 5 in each iteration. In the body of for loop, 
//the switch statement with five cases and a default label. For every loop, 
//the expression in the switch is matched, and the matched case statement will 
//display a message. 
//Hint: always watch output mismatch in case of an error while submitting, it will show the difference between your and expected answers. 
//	
	public static void main(String[] args) {
		for (int x = 5; x <= 25; x = x + 5) {
			System.out.println(x);
			// Switch on number.
			String message;
			switch (x) {
			
			case 5: {
				message="The case 5 is true";
				break;
			}case 10: {
				message="The case 10 is true";
				break;
			
			}case 15: {
				message="The case 15 is true";
				break;
			
			}case 20: {
				message="The case 20 is true";
				break;
			
			}case 25: {
				message="The case 25 is true";
				break;
			
			}default: 
				message="The loop is finished";
			}System.out.println(message);
			}
		}}
