package com.bptn.course._05_strings;

import java.util.Scanner;

public class String_Puralizer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		int amt;
		String word;
			
		   
		  System.out.println("Enter Number and String ");
		  amt= scanner.nextInt();
		  scanner.nextLine();
		  word= scanner.nextLine();
		   
		   
	   
	    if (word.endsWith("fe") && amt > 1) {
	        word = word.replace("fe", "ves");
	        System.out.println(amt + " " + word);
	        	
       } else if(word.endsWith("y") && !(word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) &&  amt > 1)  {
    	   word = word.replace("y", "ies");
    	   System.out.println(amt + " " + word);
       } else if((word.endsWith("sh") || word.endsWith("ch")) && amt > 1) {// fix to make multiple booleans
    	   word = word + "es";
    	   System.out.println(amt + " " + word );
       } else if (word.endsWith("us") && amt > 1) {
    	   word = word.replace("us", "i");
    	   System.out.println(amt + " " + word);
       } else if ((word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) && amt > 1) {// fix to use multiple booleans
    	   word += "s";
    	   System.out.println(amt + " " + word );
       }else if (amt == 1) {
    	 
    		   
    	   System.out.println(amt + " " + word );
    	  
    	   
       } else {
    	   word = word + "s";
    	   System.out.println(amt + " " + word );
    	   

       }
	  
	   scanner.close();
	       
    
	}

}
