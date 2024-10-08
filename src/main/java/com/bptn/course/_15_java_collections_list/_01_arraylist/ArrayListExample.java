package com.bptn.course._15_java_collections_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayList<>();
		
		
		//2nd way of declaring ArrayList - implentation (recommended)
		List <Integer> arrayList = new ArrayList<>();
		
		//Add values into arrayList
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300); // Allow duplicates
		arrayList.add(300);
		arrayList.add(400);
		arrayList.add(null); //Array allow null values
		arrayList.add(null);
		arrayList.add(null);

		System.out.println(arrayList);
		
		//The size of the arraylist
		System.out.println(arrayList.size());
		
		//Access the first element
		System.out.println(arrayList.get(0));
		
		//Update the element at index 2
		arrayList.set(2, 250);
		System.out.println(arrayList);
		
		arrayList.set(5, 540);
		System.out.println(arrayList);
		
		arrayList.set(7, 500); //add(int index, element E)
		System.out.println(arrayList);
		
		//Remove an element
		System.out.println(arrayList.remove(4));
		System.out.println(arrayList.size());
		
		//Access the using elements using traditonal for-loop
		for (int i= 0; i< arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//Access the using elements using traditonal for-each
		for(Integer element: arrayList) {
			System.out.println(element);
		}
		
		
		
		
		
	}

}

//<> diamond operators -> Java Generics

//1. Solid principles -Dependency inversion principles 

//We need to rely on Abstraction than concrete implemantation

//1. The first way of declaring is relying on croncrete implemntation; it does not follow Depancy Inversion Principles

//2.The second way gets access to declaring is relying on Abstraction which folow DIP

//3. ArrayList<Integer> arrayList = new ArrayList<>();
//The arrayList object has access to methods from List class and ArrayList
