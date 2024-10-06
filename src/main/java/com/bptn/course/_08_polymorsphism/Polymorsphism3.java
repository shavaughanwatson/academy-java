package com.bptn.course._08_polymorsphism;

public class Polymorsphism3 {
	
	void print (int integer) {
		System.out.println("Printing an interger:" + integer);
	}
	
	void print(String s) {
	System.out.println("Printing an interger " + s);
	}
	
	int print(int a , int b) {
		return a+b;
	}
	
	double print(double a , double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorsphism3 p1 = new Polymorsphism3();
		p1.print(5);
		
		p1.print("Hello World");
		
		System.out.print("The sum of two integers:" + p1.print(5, 4));
		
		System.out.println("The sum of two doubles" + p1.print(2.0, 3.0));
			
		}
	}



//Major key takeaways

//Method overloading-comile time polyporphism
//1. It occur within the same class and no inheritance is required
//2. The name can be the same
//3. can have different return types and number of parameters can be different
//4. Can have different type of parameters
//5. Static method can be overloaded