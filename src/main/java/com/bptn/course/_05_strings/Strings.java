package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		// to create a new String
		String s = "Hello World";

		int stringLength = s.length();

		System.out.println("The length of the string is: " + stringLength);

		String sub = s.substring(0, 5);

		System.out.println("The substring with start index 0 and end index 5 " + sub);

		String sub1 = s.substring(3);

		System.out.println("The substring with start index 3" + sub1);

		String lowerCase = s.toLowerCase();

		System.out.println("The lowercase of the with string " + lowerCase);

		String UpperCase = s.toUpperCase();

		System.out.println("The uppercase of the with string " + UpperCase);

		int indexOf = s.indexOf("World");

		System.out.println("The index of World is:" + indexOf);

		// Find the character at the specified index -0
		char c = s.charAt(0);

		System.out.print(c);

		// Find the character at the specified index -3
		char cl = s.charAt(3);

	}
}
