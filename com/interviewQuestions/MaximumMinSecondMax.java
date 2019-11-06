package com.interviewQuestions;

public class MaximumMinSecondMax {

	public static void main(String[] args) {
//find the maximum, minimum, and second maximum number in the array
		int[] n = { -21, 3, 4, 5, 9, -89, 72, 65, 34, 12, 34, 79, 0, -26, -1 };

		int max = n[0];
		int secondMax = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				secondMax = max;
				max = n[i];
			} else if (secondMax < n[i]) {
				secondMax = n[i];
			}
		}
		System.out.println("The second max # => " + secondMax);
		System.out.println("The max number # => " + max);

		int min = n[0];
		int secondMin = n[0];
		for (int i = 0; i < n.length; i++) {
			if (min > n[i]) {
				min = n[i];
			} else if (secondMin > n[i]) {
				secondMin = n[i];
			}
		}
		System.out.println("The second min # =>" + secondMin);
		System.out.println("The minimum number # => " + min);

	}

}
