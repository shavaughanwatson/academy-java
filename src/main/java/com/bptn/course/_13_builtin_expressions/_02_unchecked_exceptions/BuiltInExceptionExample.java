package com.bptn.course._13_builtin_expressions._02_unchecked_exceptions;

public class BuiltInExceptionExample {
	
	//create a method - which checks if the number or positive or negative
	//throws- always comes in the method head signature which warns this method
	// has the ablity to encounter a situatuon and should be in a position to handle it
	
	public static void checkPositive(int number )throws IllegalArgumentException{
		
		if(number<0) {
			throw new IllegalArgumentException("The number must be positve");
		}
		
		System.out.println("The number is positve");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkPositive(10);
			checkPositive(-10);
			
		} catch(IllegalArgumentException e) {
			 System.out.println("Caught an exception: " + e.getMessage());
		}
		
	
	}

}
//IllegalArgumentException is sub class of RuntimeException
//RuntimeExceptoion is sub class of Exception

//throws is optimal in case of unchecked exception
//throws is used in case of checked exception
//throw is used explicity within a method or block of code
//throw creates an instance of Exception(or sub-classes) it tries to signal the program that has gone wrong
