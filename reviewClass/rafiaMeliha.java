package reviewClass;

import java.util.Scanner;

public class rafiaMeliha {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please tell me who you are?");
		String name=input.next();
		if (name.contains("Rafia")) {
			System.out.println("Askim seni seviyorum, but you need to study harder");
		}else if (name.contains("Meliha")) {
			System.out.println("Askim seni seviyorum. I am proud of you! But try not to be lazy");
		}else if (name.contains("Vildan")) {
			System.out.println("Askim seni seviyorum ve hep sevecegim");
		}else {System.out.println("Hi PepperMint");}
				

	}

}
