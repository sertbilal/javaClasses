package reviewClass;

public class NestedForLoopElijon {

	public static void main(String[] args) {
		
		for (int row=1; row<=4; row++) {
			System.out.print("Row"+ row+ "->");
			for (int column=1; column<=6; column++) {
				System.out.print(row+"."+column + " ");
			}
			System.out.println();
		}

	}

}
