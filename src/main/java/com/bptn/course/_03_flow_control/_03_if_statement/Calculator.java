package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
	         int choice;
	         double num1;
	         double num2;
	         double result;
	         
	       
	         
	     
	        do {
	        	
	            // Display the main menu
	            System.out.println("/...Calculator Menu.../");
	            System.out.println("Press 1 for Addition");
	            System.out.println("Press 2 for Subtraction");
	            System.out.println("Press 3 for Multiplication");
	            System.out.println("Press 4 for Division");
	            System.out.println("Press 5 to square a number " );
	            System.out.println("Press 6 to find a square root " );
	            System.out.println("Press 7 to find the reciprocal " );
	            choice = scanner.nextInt();
	    
	            
	            	
	            		 
	            	  if(choice == 1) {
	            		 //Addition
	            		 System.out.println("Enter first number: ");
	                     num1 = scanner.nextDouble();
	                     System.out.println("Enter second number: ");
	                     num2 = scanner.nextDouble();
	            		 
	            		 result = num1 + num2;
	            		 System.out.println("Result: " + result);
	            	 } else if (choice == 2) {
	            		 //Subtraction
	              		 System.out.print("Enter first number: ");
	                     num1 = scanner.nextDouble();
	                     System.out.print("Enter second number: ");
	                     num2 = scanner.nextDouble();
	            		 
	            		 result = num1 - num2;
	            		 System.out.println("Result: " + result);
	            	 } else if ( choice == 3) {
	            		 
	            		 //Multiplication
	            		 System.out.print("Enter first number: ");
                     num1 = scanner.nextDouble();
                     System.out.print("Enter second number: ");
                     num2 = scanner.nextDouble();
                	 result = num1 * num2;
                	 System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
	            	 } else if (choice == 4) {
	            	//Division
	                System.out.println("Enter the first number");
	                num1 = scanner.nextDouble();

	                  System.out.println("Enter the second number");
	                num2 = scanner.nextDouble(); 
                   
	                 double quotient = num1 / num2; // Calculate the quotient
                     double remainder = num1 %  num2; // Calculate the remainder
	                System.out.println("Dividing " + num1 + "by " +  num2 + " the quotient is " + quotient + " The remainder is " + remainder); 
	           
	                } else if(choice == 5) {
	                //Square a Number
	                    System.out.println("Enter square number");
	                    num1 = scanner.nextDouble();
	                    double square = num1 * num1;
	                    System.out.println("The Square of the number " + num1 +" is ="+ square);
	                System.out.println();
	                } else if (choice == 6) {
	                	double squareRoot;
	                	//Square Root of Number
	                	System.out.println("Enter square root 6 number");
	                	num1 = scanner.nextDouble();
	                	squareRoot =Math.sqrt(num1);
	                	System.out.println("The SquareRoot is " + squareRoot);
	                // Ask if the user wants to go back to the main menu
	                	
	                } else if (choice == 7) {
	                	// Find Reciprocal
	                double reciprocal;
	                num1 = scanner.nextDouble();
	                reciprocal = 1 /num1;
	                System.out.println("The Reciprocal of the number " + num1 + reciprocal);
	                
	                } else {
	             
	                // Exit the program if choice is not valid for operations
	                	System.out.println("Exiting the calculator.");
	                
	                }
	    
	            	  
	                  System.out.println("Press 1 to continue calculations or exit program ");
	                  int repeatChoice = scanner.nextInt();
	                  
	                  if (repeatChoice != 1) {
	                	  break;
	                  }
	      
	        } while(choice == 1);
	  
	        scanner.close();     
	       
	       
	}
}
	

	







