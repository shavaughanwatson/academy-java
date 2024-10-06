package com.bptn.course._07_opps;

public class Phone {
	//declare instance variables - properties/attributes
	private int weight;
	private int height;
	private int width;
	private String color;
	
	//Constructor below the instance variables
	//Does not haven't any return type
	//Default constructor - does not have any parameters passed
	
	public Phone() {
		
		//default values
		weight=150;
		height =140;
		width = 70;
		color = "Black";
	}
	
	//1st Paramertired constructor - which has parameters passed
	public Phone( int wt, int h, int wi, String c) {
		weight = wt;
		height = h;
		width =wi;
		color = c;
				
	}
	
	//2ndst Paramertired constructor - which has parameters passed
	public Phone( int wt, int h, int wi) {
		weight = wt;
		height = h;
		width =wi;

				
	}
	
	
	
	public void makePhoneCall() {
		System.out.println("Make a phone call");
	}
	
	
	public void sendTextMessage() {
		System.out.println("Make a text message");
	}
	
	
	
	
	//declare instance methods - behavior/ functionality
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        

        
		
		Phone myObj1 = new Phone(); // will have values from instance variables on default
		        System.out.println("Default Phone: "+" Weight:" + myObj1.weight);
		
		System.out.println("Default Phone: "+" Weight:" + myObj1.weight);
		
		Phone myObj2 = new Phone(200, 100, 50, "Red"); // set your own parameters
		System.out.println("Default Phone: "+" Weight:" + myObj2.weight);
		
		Phone myObj3 = new Phone(230, 140, 50); // will only call the constructor that has a specific number of parameters
		System.out.println("Default Phone: "+" Weight:" + myObj3.weight);
		
		myObj1.makePhoneCall();
		myObj1.sendTextMessage();
		
	}

}


//Instance methods are always declared PUBLIC to be accessible

//Paramaters contructor can have as many as they want.
//We can only have 1 default constructor within a class
//If we do not have my constructors in the class = Java will automatically create Java  default constructors 