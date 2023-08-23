package com.collection.practice;

import java.util.HashMap;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String str = "This the This the Dee Dee case case";
		String strArr [] = str.split(" ");
		String newArr[] = null;
		int j=0;
		HashMap<String,Integer> hm =new <String,Integer>HashMap();
		
		for(int i=0;i<strArr.length;i++)
		{
			if(hm.containsKey(strArr[i]))
			{
				continue;
			}
			else
			{
				hm.put(strArr[i], 1);
				//newArr[j] = strArr[i];
				j++;
			}
		}
		System.out.println(hm);
	}

}
