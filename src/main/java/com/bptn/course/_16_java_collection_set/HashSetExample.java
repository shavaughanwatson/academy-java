package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("apples");
		hashSet.add("bananas");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple");
		hashSet.add(null);
		
		System.out.println("The HashSet of fruits: " + hashSet);
		

	}

}


// 1. Inseration order -NO

// 2. It allows null values? It allows max null value

// 3. It allows duplicates -NO

// 4. Underlying implmentation -Hash Table

//5 Is a HashSet indexed ? - NO