package com.bptn.course._13_builtin_expressions._02_unchecked_exceptions;

public class Main1 {
	
	void method2() {
		try {
			
			
			try {
				
				int[] arr = {1,2,3,4};
				
				System.out.println(arr[0]);
				System.out.println(arr[5]);
				
			} catch(ArithmeticException e) {
				System.out.println("ArtithmeticException is h");
			}
		
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndeOutOfBoundException is h");
		
		}
		
	}
	

	
	
 
	    public static void main(String args[]) {
	        Main1 exceptionSolutionObject = new Main1();
	        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
	    }

}
