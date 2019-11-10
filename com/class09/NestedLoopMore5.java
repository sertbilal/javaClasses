package com.class09;

public class NestedLoopMore5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {//Controls Rows
			for (int j = 1; j <= i; j++) {//Control Column
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
