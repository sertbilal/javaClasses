package reviewClass;

import java.lang.reflect.Array;

public class BeraberForLoop {

	public static void main(String[] args) {
		
		
		int [][] array= { {367,6,8,8979},
				         {7,8,8,6}, 
				         {4,6,5,4},
				         {4,-6,0,2},
				         };
		
		
		int max=array[0][0];
		int min=array[0][0];
		
		for (int i=0; i<array.length; i++) { //row
			for (int k=0; k<array[i].length; k++) {
				if (max<array[i][k]) {
					max=array[i][k];
					
				}if (min>array[i][k]) {
					min= array[i][k];
				}
				
				
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		

	}

}
