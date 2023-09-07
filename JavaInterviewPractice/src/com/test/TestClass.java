package com.test;

import java.util.*;

public  class  TestClass {


	public static void main(String[] args)
	
	{
		int arr[] = {21,34,22,65,43};
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			ll.add(arr[i]);
		}
		
		int p=4;
		
		for(int j=0;j<p;j++)
		{
			ll.add(ll.get(0));
			ll.removeFirst();
		}
		
	Iterator it = ll.iterator();
	
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

	


