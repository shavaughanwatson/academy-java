package com.bptn.course._09_abstraction;

public class Abstraction2 {
	
interface ShapeInterface {

	  //Before Java 8- interfaces had abstracts methods and constants
	//lets create some abstracts
	
	void draw();
	
	double getArea();
}

// class RectangleClass implements 
class RectangleClass implements ShapeInterface {
	
	private double width;
	private double height;

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		RectangleClass r1 = new RectangleClass();
		
		r1.draw();
		*/
	}

}

//Interface cannot be instantiated-canoot be used to create objects