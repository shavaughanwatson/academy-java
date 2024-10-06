package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {

		int[] myArray = { 3, 5, 7, 9, 11, 13 };

		String name = "shavaughan";

		System.out.println("First element" + myArray[0]);

		System.out.println("Second element" + myArray[1]);

		myArray[0] = 30;

		System.out.println("Updated first element" + myArray[0]);

		myArray[myArray.length - 1] = 130;

		System.out.println("Updated last element" + myArray[myArray.length - 1]);

		/*
		 * for(int i=0; i <myArray.length-1; i++) { System.out.println(myArray[i]); }
		 * 
		 */

		/*
		 * for(int i=myArray.length-1; i >=0; i--) { System.out.println(myArray[i]); }
		 */

		for (int element : myArray) {

			System.out.println(element);
		}

		// How to print elements without the using for-loop
		System.out.println(myArray); // keep note of this.

	}
}
