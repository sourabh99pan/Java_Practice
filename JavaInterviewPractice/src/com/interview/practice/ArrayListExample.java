package com.interview.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		
		ArrayList<Integer> alist =new <Integer> ArrayList();
		
		for(int i=0;i<6;i++)
		{
			alist.add(i);
		}
		
		Iterator<Integer> it =alist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
