package com.bptn.course._15_java_collections_list._02_linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListListExample {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<>();

		// add elements to the list
		colors.addFirst("red");

		// add elements to the list to the end
		colors.addLast("green");

		System.out.println("LinkedList after adding colors:" + colors);

		// Remove element from the beginning
		colors.removeFirst();

		// Remove element from the end
		colors.removeLast();

		System.out.println("LinkedList after adding colors:" + colors);

		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.add("purple");

		System.out.println("LinkedList after adding colors:" + colors);

		// Remove an element from index 1
		colors.remove(1);

		System.out.println("LinkedList after removing element at index 1:" + colors);

		// Add an element at index 1
		colors.add(1, "pink");

		System.out.println("LinkedList after adding element at index 1::" + colors);

		// Access and element at index 2

		System.out.println("Access an element at index 2 " + colors.get(2));

		// Access elements in the LinkedList with a for-loop
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}

		// Access elements in the LinkedList with a for-each
		for (String element : colors) {
			System.out.println((element));
		}

		// Using a Iterator
		Iterator<String> it = colors.iterator(); // declare iterator

		// first operation
		while (it.hasNext()) {
			System.out.println("Accessing next element using Iterator: " + it.next());
		}

		// Remove an element
		Iterator<String> it2 = colors.iterator();

		while (it2.hasNext()) {
			if (colors.equals("purple")) {
				it2.remove();
				System.out.println("The color is removed successfully");
			}
		}

		// Add an element
		ListIterator<String> listIterators = colors.listIterator();
		while (listIterators.hasNext()) {

			if (colors.equals("orange")) {
				listIterators.add("black");
				System.out.println("The color added successfully");
			}
		}

		System.out.println("LinkedList after adding element at index 1::" + colors);
	}

}

//1. Can a LinkedList have duplicates - Yes
//2. Can a LinkedList preserve inseration order - Yes
//3. Can a LinkedList have null values- Yes.
//4. Can you add or remove elements by looping-Yes.
