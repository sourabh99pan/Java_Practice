package com.practice;

import java.util.HashMap;

public class TestClass2 {

	public static void main(String[] args) {

		String [] arr = {"Selenium","python","Selenium","Java","python"};
		
		
		HashMap<String, Integer> hs =new <String, Integer>HashMap();
		
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
		
		System.out.println(hs);
	}

}
