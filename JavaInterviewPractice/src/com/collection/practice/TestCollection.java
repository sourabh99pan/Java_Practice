package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestCollection {

	public static void main(String[] args) {

		
		String arr[] = {"3:Sourabh","2:Rahul","1:Virat","4:Sachin"};
		
		HashMap<Integer, String> hm = new <Integer, String>HashMap();
		
		ArrayList<Integer> alist = new <Integer> ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			String value = arr[i];
			
			String strArr[] = value.split(":");
			
			hm.put(Integer.parseInt(strArr[0]), strArr[1]);
			
			strArr[0]="";
			strArr[1]="";
			
		}
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> e: hm.entrySet())
		{
			alist.add(e.getKey());
		}
		
		Collections.sort(alist);
		
		
		
	}

}
