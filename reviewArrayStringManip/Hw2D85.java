package reviewArrayStringManip;

public class Hw2D85 {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1,1 }, { 1, 1, 1,1 }, { 1,1, 1, 1 } };

		// System.out.println(a.length!=a.length);
//Benim versiyon
		boolean isEqual = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				if (a.length ==a[i].length) {
					isEqual=true;
					}else {
						isEqual=false; 
					}	
			}System.out.println(isEqual);
			
		}

//*****Instructor's Solution*******ikiside duzenli sonuc vermiyor
//			boolean flag = false;
//			
//			for (int i = 0; i < a.length; i++) {
//				if (a.length == a[i].length){
//					flag = true;
//				}
//				break;
//			}
//			System.out.println(flag);

	}
