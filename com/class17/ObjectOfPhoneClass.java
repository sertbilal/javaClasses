package com.class17;

public class ObjectOfPhoneClass {

	public static void main(String[] args) {
		Phone nokia=new Phone();
		nokia.name="Nokia";
		nokia.opSystem="Symbian";
		nokia.madeIn="Finland";
		nokia.takeSelfie();
		nokia.hasGPS();
		
		Phone iPhone=new Phone();
		iPhone.name="IPhone";
		iPhone.opSystem="IOS";
		iPhone.madeIn="US";
		iPhone.takeSelfie();
		iPhone.hasGPS();
		
        String str="Hello";
        str.length();
        str.toUpperCase();
		
		Phone Samsung=new Phone();
		Samsung.name="Samsung Galaxy";
		Samsung.madeIn="South Korea";
		Samsung.opSystem="Android";
		Samsung.takeSelfie();
		Samsung.hasGPS();
		
		System.out.println(nokia.name+nokia.opSystem+nokia.madeIn);

	}

}
