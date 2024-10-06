package com.bptn.course._10_static_concepts;

public class ClassName {
	
	//decalre 
	static int staticVariable = 100;
	
	int instanceVariable;
	
	static void staticMethod() {
		
		System.out.println("Static method is called called..");
		
		//can I access an instance variable? No
		//instanceVariable = 100;
		
		//can I acesss an instance method? no
		//this.instanceMehod();
		
	}
	
	void instanceMethod() {
		System.out.println("Instance method is called..");
		//can I access a static variable within an intance method - Yes
		System.out.println("Static variable :" + staticVariable);
		
		
		//can I access a static method within an instance method -yes
		staticMethod();
		
		
	}
	

	public static void main(String[] args) {
		
		ClassName c1 = new ClassName();
		c1.instanceMethod();
		
		System.out.println("Static variable:" + staticVariable);
		
		staticMethod(); // can only be used directly
		
		


	}

}


