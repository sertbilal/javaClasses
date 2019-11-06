package reviewClass;

public class review1 {
	public static void main(String[] args) {

		int num1 = 10000;

		if (num1 < 100) {
			System.out.println("You entered 2 Digits");
		} else if (num1 < 1000) {
			System.out.println("You entered 3 Digits");
		} else if (num1 < 10000) {
			System.out.println("You entered 4 Digits");
		} else {
			System.out.println("Ya Selaaam");
		}
	}
}
