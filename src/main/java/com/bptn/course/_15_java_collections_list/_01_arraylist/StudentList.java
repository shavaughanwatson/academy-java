package com.bptn.course._15_java_collections_list._01_arraylist;
import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
	      ArrayList<Student> roster = new ArrayList<Student>();
	      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
	      
	      // add your code here

	      Student s2= new Student("Ayanna","ayanna@gmail.com",789012);
	      
	      roster.add(s2); //Added the 2nd student into the ArrayList
	      
	      System.out.println(roster);

	}

}
