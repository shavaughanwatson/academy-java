package com.bptn.course._08_polymorsphism;

public class Polymorphism2 {

	//parent Shape
class Shape {
		void drawAngle() {
		System.out.println("Drawing a shape angle");
		}
	}
	
	
//sub-class
class Rectangle extends Shape{
	
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
    Rectangle r1 = new Rectangle();
    r1.drawAngle();
	}
        */ 
}
	
}


//1. create a parent class called Shape
//2. create one-sub-class called Rectangtle
//3. create a method called drawingAngle() in the Shape override it in the Rectangle class