package com.bptn.course._07_opps;

public class Employee {

	
	//1. Create Instance variables (name, employeeId and age)
	private String name;
	private int employeeId;
	private int age;
	
	//2. Create Constructor
	
	//default constructor
	public Employee() {
		this.name ="Shavaughan";
		this.employeeId = 100;
		this.age =20;
	}
	
	//Parameterized constructor - with 2 parameters
	public Employee(String name, int employeeId) {
		
		this.name=name;
		this.employeeId=employeeId;
	}
	
	//Parameterized constructor - with 3 parameters
	public Employee(String name, int employeeId, int age) {
		
		
		this(name, employeeId); //this is this is trying to call the constructor Employee(String name, int employeeId) -with 2 parameters
		
		//this.name=name;
		//this.employeeId=employeeId;
		this.age=age;
	}
	
	public void printInfo() {
		System.out.println("Employee name:" + this.name + "EmployeeId:" + this.employeeId);
	}
	
	//method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.printInfo();
		
		Employee e2 = new Employee("Jane Smith", 5678, 30);
		e2.printInfo();
		
		Employee e3 = new Employee("Jane Smith" , 5697, 30); //this keyword is pointing to the CURRENT INSTACE
		e3.printInfo();
	}

}


//this keyword is used to point to the current instance variable- if you have instance variables, local variable with exactly the name

