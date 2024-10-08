package com.bptn.course._14a_big_fri_coding_2._employee;

public class Main {
	   public static void main(String[] args) {
	       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
	       Employee student = new Employee(100, 8);
	       student.setSalary();
	       student.setHoursPerDay();
	      

	       // print the salary of the employee
	       System.out.println(student.getSalary());
	   }
}
