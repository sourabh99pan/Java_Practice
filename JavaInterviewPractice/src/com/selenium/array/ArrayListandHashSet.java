package com.selenium.array;

import java.util.*;

public class ArrayListandHashSet {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new <String>ArrayList();
		
		alist.add("Rahul");
		alist.add(null);
		alist.add("Sachin");
		alist.add("Virat");
		alist.add("Dhoni");
		alist.add("Rahul");
		alist.add("Virat");
		alist.add("Dhoni");
		
		System.out.println(alist);
		
		HashSet<String>hs = new HashSet<String>();
		
		hs.addAll(alist);
		
		System.out.println(hs);
		
		

	}

}
