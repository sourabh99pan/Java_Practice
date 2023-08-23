package com.collection.practice;
import java.util.*;

public class HashSetTraverse {

	public static void main(String[] args) {
		
	    // Declaring a HashSet
	    HashSet<String> hashset = new LinkedHashSet<String>();
	    
	    // Add elements to HashSet
	    hashset.add("Pear");
	    hashset.add("Apple");
	    hashset.add("Orange");
	    hashset.add("Papaya");
	    hashset.add("Banana");  
	    
	    Iterator it = hashset.iterator();
	    
	    System.out.println("While loop");
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("For each loop");
	    
	    for(String str:hashset)
	    {
	    	System.out.println(str);
	    }

	}

}
