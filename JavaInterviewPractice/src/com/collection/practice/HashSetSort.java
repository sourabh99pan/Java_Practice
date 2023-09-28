package com.collection.practice;

import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetSort {

	public static void main(String[] args) {

	    HashSet<String> hs = new HashSet<String>();
	    
	    // Add elements to HashSet
	    hs.add("Pear");
	    hs.add("Apple");
	    hs.add("Orange");
	    hs.add("Papaya");
	    hs.add("Banana");  
	    
	    List<String> list = new LinkedList<String>(hs);
        Collections.sort(list);
	    
        Iterator it = hs.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
	}

}
