package com.bptn.course._04_arrays;

public class FindOddPoshArray {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 50 };

		// Approach 1
		/*
		 * for(int i =1; i<numbers.length; i+=2) { System.out.println(numbers[i]); }
		 */

		// Approach 2
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}
	}

}
