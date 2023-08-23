package com.collection.practice;

import java.util.*;

public class ArrayListElementExist {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(21,44,56,7732,22,11));
		boolean flag=false;
			for(int a:alist)
			{
				if(a==11)
				{
					System.out.println(a+" is Element present");
					flag=true;
					
				}

			}
			
			if(flag==true)
			{
				System.out.println("Element is present");
			}
			else
			{
				System.out.println("Element is not present");
			}
			
			if(alist.contains(11))
			{
				System.out.println("Element is present");
			}
			else
			{
				System.out.println("Element is not present");
			}
	}

}
