package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class String_Operations {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
		  String s1;
		  String s2;
		  String s3;
		  int choice;
		  do {
            // Display the menu
            System.out.println("\nString Operations Menu:");
            System.out.println("1. Check if a string is a palindrome");
            System.out.println("2. Reverse a string");
            System.out.println("3. Combine two strings");
            System.out.println("4. Calculate the length of a string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Check palindrome directly in the case
                    System.out.print("Enter a string: ");
                    s1 = scanner.nextLine();
                    String palindromeWord = "";
                    
                    for (int i = s1.length() -1; i >= 0; i-- ) {
                    	  char s1Letter = s1.charAt(i);
                    	  
                    	  palindromeWord += s1Letter;
                    }
                    
                    if (s1.equals(palindromeWord)) {
                        System.out.println(s1 + " is a palindrome.");
                    } else {
                        System.out.println(s1 + " is not a palindrome.");
                    }
                    break;

                case 2:
                    // Reverse string directly in the case
                    System.out.print("Enter a string: ");
                    s1 = scanner.nextLine();
                    String reversedWord = " ";
                    
                    for (int i = s1.length() -1; i >= 0; i-- ) {
                    	  char s1Letter = s1.charAt(i);
                    	  
                    	  reversedWord += s1Letter;
                    }
                    
                    System.out.println(reversedWord);
           
                    break;

                case 3:
                    // Combine two strings directly in the case
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Combined string: " + str1 + str2);
                    break;
                    
                case 4:
                    // String Comparison
                    System.out.print("Enter First string: ");
                    s1 = scanner.nextLine();
                    System.out.print("Enter Second string: ");
                    s2 =scanner.nextLine();
                    System.out.println(s1.equals(s2)); // put if statement
                    break;

                case 5:
                    // Calculate string length directly in the case
                    System.out.print("Enter a string: ");
                     s3 = scanner.nextLine();
                    System.out.println("Length of the string: " + s3.length());
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice !=6);
		  
		  scanner.close();
}
	
}

