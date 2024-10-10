package com.bptn.course._17_collections_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Toronto", 1000);// key = city, value = 1000
		treeMap.put("Burlington", 4000);
		treeMap.put("Ottawa", 2000);
		treeMap.put("London", 500);
		treeMap.put("Scarborough", 2500);
		
		treeMap.put("Brampton", null);
		treeMap.put("Hamilation", null);
		treeMap.put("Toronto", 30000);
		
		System.out.println(treeMap);
			
		//Access the first key of the map
		System.out.println(treeMap.firstKey());
		
		//Access the first entry of the map
		System.out.println("Access the first entry of the map" + treeMap.firstEntry());
		
		//Loop through the map using keySet() method
		for(String key: treeMap.keySet()) {
			System.out.println("The key is: "+ key + " the value is: "+ treeMap.get(key));
		}
		
		//subMap is used to get a portion the map
		System.out.println("The sub map from Brampton to Ottawa excluding Ottawa " + treeMap.subMap("Brampton", "Ottawa"));
		
		//headMap(K toKey) method - finds portion that is less to key
		System.out.println("The map strictly less than key london: "+ treeMap.headMap("London"));
	}

}

//Major key takeaways:
//1. Does it preserve insertion order? 
//2. Does keys allow null values? 
//3. Does values allow null values ? 
//4. Does keys allow duplicates?  
//5. Does the values allow duplicates?  
//6. Does values allow duplicates?