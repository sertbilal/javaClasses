package com.interviewQuestions;

public class InterviewQuestionsTask {

	public static void main(String[] args) {
		String s1="9405957744";
		System.out.println(s1.replaceAll("0", "1"));
		
//find the maximum, minimum, and second maximum number in the array
		int[] a= {1,25,6,98,7,-545,56,-26};
        int min=a[0];
  
		
		for(int i=0;i<a.length;i++) {
            if(min>a[i]) {
                
                min=a[i];
                }
        }System.out.println(min);
        System.out.println();
}
}
