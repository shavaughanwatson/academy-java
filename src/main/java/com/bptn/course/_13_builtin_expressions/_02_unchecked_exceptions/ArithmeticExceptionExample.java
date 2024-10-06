package com.bptn.course._13_builtin_expressions._02_unchecked_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// critical statement
		
		try {
			int result = 10/0;
			
			System.out.println("The result is:" + result);
			
		}catch(ArithmeticException e) {
			
			System.out.print("An error occured:" + e.getMessage());
		}

	}

}
