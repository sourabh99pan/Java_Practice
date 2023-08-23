package com.collection.practice;

import java.util.*;

public class ArrayListTraverse {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1,45,67,32,99,76));
		
		Iterator it = alist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		for(int a:alist)
		{
			System.out.println(a);
		}
	}

}
