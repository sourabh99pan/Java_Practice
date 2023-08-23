package com.collection.practice;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<String> hs = new <String>LinkedHashSet();


		hs.add("Sourabh");

		hs.add(null);
		hs.add("Rahul");
		hs.add("Virat");
		hs.add("Rohit");
		hs.add("Sachin");
		hs.add(null);
		hs.add("Sachin");

		Iterator it = hs.iterator();

		Collections.synchronizedSet(hs);

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(hs.size());
		
	}

}
