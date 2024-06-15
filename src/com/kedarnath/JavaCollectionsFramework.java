package com.kedarnath;

/*HashMap allows for constant-time performance for basic operations (get and put).
It does not guarantee any order of the keys.

TreeMap guarantees that the entries will be sorted by keys.
It has a log(n) time complexity for the basic operations (get and put).

Explanation of the Differences:
Ordering:

HashMap: No ordering guaranteed.
TreeMap: Keys are sorted in natural order or by a comparator.
Performance:

HashMap: O(1) time complexity for insertion and access.
TreeMap: O(log n) time complexity for insertion and access.

*/
import java.util.HashMap;
import java.util.TreeMap;

public class JavaCollectionsFramework {
	public static void main(String[] args) {
		
        // HashMap
        HashMap<String, Integer> technologies = new HashMap<String, Integer>(); 
        technologies.put("Front-End", 1);
        technologies.put("Back-end", 2);
        technologies.put("testing", 3);
        System.out.println("HashMap:");
        technologies.forEach((key, value) -> System.out.println(key + " = " + value));
        
        
        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 5);
        System.out.println("TreeMap:");
        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
