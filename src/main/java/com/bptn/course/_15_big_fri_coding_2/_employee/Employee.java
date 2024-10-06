package com.bptn.course._15_big_fri_coding_2._employee;

class Employee {
	   // Instance variable to store salary
	      int salary;
	   
	   // Instance variable to store hours per day worked by employee
	      int hoursPerDay; 
	   

	   // Constructor to set instance variables(salary and hoursPerDay) value
	      public Employee (int salary, int hoursPerDay ) {
	      this.salary = salary;
	      this.hoursPerDay = hoursPerDay;
	   } 
	   
	   // Set method to update salary
	      public void setSalary(){
	     
	      if(this.salary < 500) {
	         this.salary = salary + 10;
	         System.out.println(this.salary);
	      } else {
	    	  
	      } 
	   
	   }
	   
	   // Set method to update hoursPerDay
	      public void setHoursPerDay(){

	         
	      if(this.hoursPerDay > 6) {
	         this.salary = salary + 5;
	      } else {
	        
	      } 
	      
	   }
	   
	   // Get method to return salary
	      public int getSalary(){
	         return this.salary;
	      }
	   
	}

