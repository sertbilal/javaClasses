package com.review6;

public class deneMe2DArray {

	public static void main(String[] args) {
		int[][] array = { 
                { 2, 3, 4 }, 
                { 4, 5, 6 }, 
                { 6, 7, 8 }, 
                { 8, 9, 0 } 
            };
		for (int i=0; i<array.length; i++) {
			
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");	
			}	System.out.println();
		}
		System.out.println("++++++++++++++");
		
		for (int [] i:array ) {
			for (int j:i) { 
				System.out.print(j+" ");
			}System.out.println();
		}
		
		
	
		
	}

}
