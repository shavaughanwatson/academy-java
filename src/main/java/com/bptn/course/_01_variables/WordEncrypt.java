package com.bptn.course._01_variables;

public class WordEncrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		while (count <= 10) {
		    count *= 2;
		}
		count = count - 10;
		
        char ch = 'A';
        int uxiCode= ch + 1;
        char ch2= (char) uxiCode;
        int ch3 = (char) ch + 1;
        
        System.out.println(ch);
        System.out.println(uxiCode);
        System.out.println(ch2);
        System.out.println(ch3);
        
        String word = "XYZ";
     
        char char1 = word.charAt(0);
        int charAt1 = (char) char1;
        
        System.out.println((char)charAt1);
        
        String encryptWord = "";
    
     
        
        
        for (int i= 0; i< word.length(); i++) {
        	boolean isLetter;
        		
        	char cx = word.charAt(i);
        	
        	isLetter = Character.isLetter(cx);
        	
        	if (isLetter) {
        		 char letter = Character.isLowerCase(cx) ? 'a' : 'A';
        		
        		 encryptWord += (char) ((cx - letter + 1) % 26 + letter);
        	} else {
        		encryptWord += cx;
        	}
        	
           
            
            
       
        }
        
    	System.out.println("Encrypted word: " + encryptWord);
		
		}
	}


