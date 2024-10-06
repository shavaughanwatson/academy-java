package com.bptn.course._09_abstraction;

abstract class Shape {
	//Abstract method ---> method with no implement
	abstract void draw();
	
	abstract void print();
	
	//normal methods --> has impelemtation
	void moveTo(int x, int y) {
		System.out.println("Move to:" + x +y);
	}
	
	}


//Sub Class(child class) extends Shape class
class Circle extends Shape {

	@Override
	void draw() {
		
		System.out.println("Draw a circle");
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Print a circle");
	}
	
}

class Rectangle extends Shape {

	@Override
	void draw() {
		
		System.out.println("Draw a rectangle");
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Print a rectangle");
	}
	
}


public class Abstraction {
	


	public static void main(String[] args) {
		//create objects from Circle class
		Circle c1 = new Circle();
		c1.draw();
		c1.print();
		
		c1.moveTo(2, 3);// inheritated metheod from Shape class

		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print();
	}

}
//1. Abstraction using class - its a class that cannot be instantiated- it cannot be used to create objects
//2. It consist of making implemetation using child classes.
//3 . Should follow rules of overtime
