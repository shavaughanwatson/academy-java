package com.bptn.course._09_abstraction;

public class Abstraction3 {
	
//Abstraction using interface (After Java 8)
// From Java 8 - Interfaces can support abstracts methods, default methods and static methods
	
interface Operations {
	
	void draw();
	
	default int add(int a, int b) {
		return a + b;
	}
	
	static double getRandomNumber() {
		return Math.random();
	}
	
	
}

class Calculator implements Operations {

	@Override
	public void draw() {
		
		System.out.println("Draw method implmented by Calculator class");
	}
	
}

	public static void main(String[] args) {
		/*
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2, 3);
		
		System.out.println("The result is " + result);
		
		System.out.println("The random is: " + Operations.getRandomNumber());
		*/
	}

}

//Major key takeways
//1. Interface cannot be instantaited
//2. Abstract methods in the interface is implemented using a subclass
//3. Interfaces support multiple interfaces/ parent class - sub class can support multiple interfaces

//Interface cannot have instance variables
//Interface cannot have constructors
//It can can consist of constants
