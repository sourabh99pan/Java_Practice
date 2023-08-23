package com.collection.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepetative {

	public static void main(String[] args) {
	
		int [] arr = {-1,2,2,-1,0,3};

		HashMap<Integer, Integer> hm = new <Integer, Integer>LinkedHashMap();
		
		
			for(int i=0;i<arr.length;i++)
			{
				if(hm.containsKey(arr[i]))
				{
					hm.put(arr[i], hm.get(arr[i])+1);
				}
				else
				{
					hm.put(arr[i], 1);
				}
			}
			
			for(Map.Entry<Integer, Integer> e:hm.entrySet())
			{
				if(e.getValue()==1)
				{
					System.out.println(e.getKey());
					break;
				}
			}
		}
		
		
	

}
