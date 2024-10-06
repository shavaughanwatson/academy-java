package com.bptn.course._08_polymorsphism;

class Animal {
	
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal { // only extend ONE parent class
	
	//has its own methods
	@Override// best practice to declare 'Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}





public class polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Animal a1 = new Animal();
		a1.makeSound();
		
		Dog d1 = new Dog();
		d1.makeSound();
	}

}

//METHOD OVERRIDING
//RULES FOR OVERRIDING:
//1. When subclass decides to override an existing method in the parent class
//2. Name of the method, return type of the method and number of parameters in overridden method should be exactly the same
//3. By conventation, the overriden method has @Override annotation above its method
//4. Static methods in the parent class cannot be overidden.
//5/ Run-time polymorphism


