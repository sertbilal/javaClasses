package reviewArrayStringManip;

public class Hw2D_Array_Her_Satir_Toplami_tek_tek {
//	Write a program that  takes a 2-D array 
//and prints the sums of the rows as an integer array.
//For example, the if we run rowSums for the following 2D array:
//	{	  {1,1,2}, //sum = 4
//		  {3,1,2}, //sum = 6
//		  {3,5,3}, //sum = 11
//		  {0,1,2}  //sum = 3
//		}Then we should get the following array back:4 6 11 3	
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};


		int sums[] = new int[a.length];
		
			for (int i = 0; i < a.length; i++) {
				int rowSum = 0;
				for (int j = 0; j < a[i].length; j++) {
					rowSum += a[i][j];
				}
				sums[i] = rowSum;
			}

		for(int sum : sums) {
				System.out.println(sum);
	  }
		//Benim uzun yaptigim yontem
//		int sum = 0;
//		int row = 0;
//
//		for (int k = 0; k < a[row].length; k++) {
//			sum = sum + a[row][k];
//
//		}
//		System.out.println(sum + " ");
//
//		sum = 0;
//		row = 1;
//		for (int k = 0; k < a[row].length; k++) {
//			sum = sum + a[row][k];
//
//		}
//		System.out.println(sum + " ");
//
//		sum = 0;
//		row = 2;
//		for (int k = 0; k < a[row].length; k++) {
//			sum = sum + a[row][k];
//
//		}
//		System.out.println(sum + " ");
//		
//		sum = 0;
//        row = 3; 
//        for (int k = 0; k < a[row].length; k++) {
//                	 sum=sum+a[row][k];
//                	 
//                	 } System.out.println(sum+" ");
	  
		}
	}