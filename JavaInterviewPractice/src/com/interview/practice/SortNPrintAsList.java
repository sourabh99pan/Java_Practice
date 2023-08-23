package com.interview.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SortNPrintAsList {

	public static void main(String[] args) {
		
	int[] arr= {1,2,3,4,5,1,3,5,6,6,7,8,7,8,3};
		
		HashMap<Integer, Integer>hm=new LinkedHashMap<Integer, Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				continue;
			}
			else
			{
				hm.put(arr[i], 1);
				alist.add(arr[i]);
			}
		}
		
		System.out.println(alist);

	}

}
