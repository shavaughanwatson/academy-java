package com.bptn.course._15_java_collections_list._01_arraylist;

public class Student {
	// instance variables
	private String name;
	private String email;
	private int id;

	// parameterized constructor
	public Student(String initName, String initEmail, int initId) {
		name = initName;
		email = initEmail;
		id = initId;
	}

	// toString() method
	public String toString() {
		return id + ": " + name + ", " + email;
	}

}
