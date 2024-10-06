package com.bptn.course._13_builtin_expressions._02_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text=null;
		
		//System.out.println("Length of the string is " +length());
		
		try {
			System.out.println("Length of the string is " + text.length());
		} catch(NullPointerException e) {
			System.out.println("An error has occured " + e.getMessage());
		}
		
		System.out.println("statment executed after try/catch block");
	}

}
