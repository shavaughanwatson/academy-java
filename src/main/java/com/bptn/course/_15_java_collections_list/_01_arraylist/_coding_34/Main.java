package com.bptn.course._15_java_collections_list._01_arraylist._coding_34;


import java.util.List;
import java.util.ArrayList;
public class Main {
	 public static void main(String[] args) {
	        
	       List<String> nameList = new ArrayList<String>();

	       nameList.add("Robert");
	       nameList.add("Samson");
	       nameList.add("Alex");
	       nameList.add("William");
	       
	       System.out.println("Elements of List: " + nameList);

	       // Create an array of String named output of the same size as nameList.
	       // Hint: use the size() method.
	       String[] output = new String [nameList.size()];

	        
	       // Fetch the elements from the nameList and insert them into the newly created array.
	       // Hint: Use the get() method to fetch the elements from the arraylist
	      for (int i =0; i< nameList.size(); i++) {
	        output[i]=nameList.get(i);
	      }

	        System.out.print("Elements of Array: ");
	        for (int i = 0 ; i < output.length ; i++){
	            System.out.print(output[i] + "  ");
	        }

	    }
}
