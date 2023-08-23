package com.interview.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberOfPairs {

	public static void main(String[] args) {
		int arr[] = {1,2,5,1,3,7,6,4,4,3,7,8,1,1,4};
		int count=0;
		HashMap<Integer,Integer> hs =  new <Integer,Integer>HashMap();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.containsKey(arr[i]))
			{
				hs.put(arr[i], hs.get(arr[i])+1);
			}
			else
			{
				hs.put(arr[i], 1);
			}
		}
		
		for (Entry<Integer, Integer> entry : hs.entrySet())
		{
			
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue()+" number of pair "+entry.getValue()/2);
		}

	}

}
