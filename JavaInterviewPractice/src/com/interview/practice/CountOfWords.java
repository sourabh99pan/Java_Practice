package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {

	public static void main(String[] args) {

		String str1 = "This is my project . You can use This my project";
		
		String[] strArr = str1.split(" ");
		
		HashMap <String,Integer> hm = new <String,Integer>HashMap();
		
		for(int i=0;i<strArr.length;i++)
		{
			if(hm.containsKey(strArr[i]))
			{
				hm.put(strArr[i], hm.get(strArr[i])+1);
			}
			else
			{
				hm.put(strArr[i], 1);
			}
		}
		
		System.out.println(hm);
		
		for(Map.Entry<String, Integer> en:hm.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		

	}

}
