package com.bptn.course._13_builtin_expressions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		/*
		try {
			readFile("result.txt");
		} catch (FileNotFoundException e) {
		System.out.println("An error occured" + e.getMessage());
		}
		*/
		


		

	}
	//create a method which read a file
	
	public static void readFile(String fileName) throws FileNotFoundException {
		//create an object of FileReader
		
		FileReader fileReader = new FileReader(fileName);
		
	}
	
	public static void callMethod() throws FileNotFoundException {
		
		readFile("result.txt");
	}

}

//FileFoundException is checked exception where the Java comploter wants you to deal with it

//When we call a method which has a checked exception in the method signature
//Java complier gives you two options
//Its option - to surrond it with a try/catch block
//2nd option - add it again in the throws of the method singature
