package com.class13;

public class RegularExpression {
//Print only text and not numbers
	public static void main(String[] args) {
		String str="14234Hel45645lo465456"; //Hello

		System.out.println(str.replaceAll("[0-9]","" ));//""bos olacak //Leave only text
		System.out.println(str.replaceAll("[a-zA-Z]", ""));////Leave only numbers
		
		//Remove everything except text and numbers
		String str2="Hi#$%How#$%#$4356346";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));//^ sembol shift 6 ile 
		
		System.out.println(str2.replaceAll("\\w", "")); //Remove everything except trash
		
		String str3= "Today is our java class";
		System.out.println(str3.replaceAll(" ", ""));//Remove the spaces 1st way
		System.out.println(str3.replaceAll("\\s", ""));//Remove the spaces 2nd way
		
		String doc="Video provides a powerful way to help you "
				+ "prove your point. When you click Online Video,"
				+ " you can paste in the embed code for the video you "
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		System.out.println(doc.length());
		System.out.println(doc.toLowerCase().replace("video", "Audio"));
		System.out.println(doc.replaceAll("powerful(.*)", ""));//.* den sonraki kismi tras et
	}

}
