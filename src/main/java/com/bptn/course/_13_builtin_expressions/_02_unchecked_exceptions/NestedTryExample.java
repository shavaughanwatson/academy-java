package com.bptn.course._13_builtin_expressions._02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//outer try-catch block

		try {

			int[] nums = { 1, 2, 3, 4 };
			int divisor = 0;
			String text = null;

			// inner try-catch block 1
			try {
				int result = nums[0] / divisor;

			} catch (ArithmeticException e) {

				System.out.println("An arithmetic exception occured: " + e.getMessage());

			}

			try {

			} catch (NullPointerException e) {

				System.out.println("An arithmetic exception occured: " + e.getMessage());

			}

		} catch (Exception e) {
			System.out.println("An general exception occured: " + e.getMessage());
		}

	}

}
