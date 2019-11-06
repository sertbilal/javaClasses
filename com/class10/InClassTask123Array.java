package com.class10;

public class InClassTask123Array {

	public static void main(String[] args) {
		//char way1
		char[] charsWay1=new char[6];
		charsWay1[0]='A';
		charsWay1[1]='B';
		charsWay1[2]='C';
		charsWay1[3]='D';
		charsWay1[4]='E';
		charsWay1[5]='F';
		System.out.println("your grade is "+ charsWay1[1]);
		//char way2 
		char[] chars= {'A','B','C','D','E','F'};
		System.out.println("your grade is "+ chars[1]);
		
		
		//String Way1
		String[] brothers=new String[6];
		brothers[0]="Ismail";
		brothers[1]="Turker";
		brothers[2]="Ahmed";
		brothers[3]="Harun";
		brothers[4]="mehmed";
		brothers[5]="Ridvan";
		System.out.println("Kim gitti guruptan? Tabiki  "+ brothers[5]);
		//String Way2
		String [] brother= {"Ismail","Turker","Ahmed", "Harun", "Mehmed", "Ridvan"};
		System.out.println("Kim gitti guruptan? Tabiki  "+ brother[5]);
		
		//String compilation with arrays
		String [] words= {"Java", "Saturday", "day", "coding"};
		System.out.println(words[1]+" is "+" "+ words[0]+" "+words[3]+" "+words[2]);
		
		

	}

}
