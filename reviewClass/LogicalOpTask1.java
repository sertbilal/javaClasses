package reviewClass;

public class LogicalOpTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to find if a number is even or odd 
	       //Print out  "My number must be even" or "My number must be odd" 
	        // Must use if else
		
		int num=13;
				
		if(!(num%2==1)) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		
		//Write a program to find if the largest Number of three numbers
	     //Print out  System.out.println("Largest number is " + largestNumber);
	      // Must use if then a else if and lastly else 

		
      Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

      if (n1 >= n2) {

          if (n1 >= n3) {

              largestNumber = n1;

          } else {

              largestNumber = n3;

          }

      } else {

          if (n2 >= n3) {

              largestNumber = n2;

          } else {

              largestNumber = n3;

          }

      }
   System.out.println("Largest number is " + largestNumber);

	}

}
