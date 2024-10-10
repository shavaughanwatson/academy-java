package com.bptn.course._17_collections_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Angie", 33);
		hashMap.put("Steve", 34);
		hashMap.put("John", 35);
		hashMap.put("Angie", 32);
		hashMap.put("Jane", 34);
		hashMap.put("Sweytha", 50);
		hashMap.put(null, 20);
		hashMap.put("Sarah", null);
		hashMap.put("Johnson", null);
		
		System.out.println(hashMap);
		
		//keySet()
		for(String key: hashMap.keySet()) {
			System.out.println("Name: " + key + " Age: " + hashMap.get(key));
		}
		
		//retrive the age of John and print it to the console
		System.out.println("Age of John is:"  + hashMap.get("John"));
		
		//Update value of existing key
		hashMap.replace("Jane", 40);
		System.out.println("The new Age of Jane is:"  + hashMap.get("Jane"));
		
		
		//Replace name NOT in list
		hashMap.replace("Hrithik", 40);
		System.out.println("The new Age of Jane is:"  + hashMap.get("Jane"));
		
		System.out.println(hashMap);
		
		//Check if the key is present in the map using containKey(Object K) method
		if(hashMap.containsKey("Jane")) {
			System.out.println("The key is existing in the map");
		} else {
			System.out.println("The key is not existing in the map");
		}
		
		//Check if the value is present in the map using containKey(Object V) method
		if(hashMap.containsValue(34)) {
			System.out.println("The value is existing in the map");
		} else {
			System.out.println("The value is not existing in the map");
		}
		
		//putIfAbsent(Object k, Object v) is used to add a key-value pair if a key does not exist in the map
		hashMap.putIfAbsent("Sweytha", 60); // it does not replace age 50 for Sweytha
		
		System.out.println(hashMap);
		
		//Iterating through the HashMap using for each loop and set-entry
		for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue());
		}
		
		//Using Iterator
		Iterator<Map.Entry<String, Integer>> it = hashMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue());
		}
	}

}

//Major key takeaways:
//1. Does it preserve insertion order? Yes
//2. Does keys allow null values? Yes only a maximum of 1;
//3. Does values allow null values ? Yes values can consist of null value (Similar to set);
//4. Does keys allow duplicates?  If we add key once gain, it overrides the value.
//5. Does the values allow duplicates? Yes behaves like a list
//6. Does values allow duplicates? Yes

