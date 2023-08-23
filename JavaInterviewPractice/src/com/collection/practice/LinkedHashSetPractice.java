package com.collection.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new <String>LinkedHashSet();
		
		lhs.add("Sourabh");
		lhs.add("Rahul");
		lhs.add("Virat");
		lhs.add("Rohit");
		lhs.add("Sachin");
		lhs.add("Naman");
		
		Iterator it = lhs.iterator();

		//Collections.synchronizedSet(hs);

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
