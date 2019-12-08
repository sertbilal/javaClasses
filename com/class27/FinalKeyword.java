package com.class27;

public class FinalKeyword {
	public final String str="Hello";

	public static void main(String[] args) {
		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		
		final String finalString="Java is easy";
		//finalString ="Java is hard"; ce-->cannot modify final variable 
		
		final int age=120;
		//age=100;
		//Final dan sonra o variable a bir daha yeni deger veremezsin
		
		FinalKeyword obj=new FinalKeyword();
		System.out.println(obj.str);

	}

}
