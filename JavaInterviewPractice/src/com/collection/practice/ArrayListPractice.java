package com.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPractice {
	
	
	public static void filterValues(List list)
	{
		Iterator it = list.iterator();
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals("TestOne"))
			{
				list.remove(i);
			}
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {

		
		ArrayList<String> all = new <String>ArrayList();
		int value = 40;
		all.add("TestOne");
		all.add("Test2");
		all.add("Test3");
		all.add("Test4");
		
		
		ArrayList<String> all1 = new <String>ArrayList(all);
		
		List<String> sublist = all1.subList(0, 2);
		
		System.out.println("sublist is "+sublist);
		System.out.println(all1);
		
		filterValues(all1);
		
		LinkedList<String> ll = new <String>LinkedList(all1);
		
		
		filterValues(all1);
		
		System.out.println("linked list: "+ll);

	}

}
