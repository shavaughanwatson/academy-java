package com.bptn.course._13_builtin_expressions._02_unchecked_exceptions;

public class Main {
	
	public void method1() {
		int[] arr = {1,2,3, 4};
		System.out.println(arr[4]);
		
	}
	
	public void method2() {
		
		try {
			method1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
		
	}
}
	
	public static void main(String[] args) {
		
        Main exceptionSolutionObject = new Main();
        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
    }
	

	

}
