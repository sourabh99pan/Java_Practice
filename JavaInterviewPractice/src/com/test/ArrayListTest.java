package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList <Integer>all = new <Integer>ArrayList();
		
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(40);
		
		Iterator it = all.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
