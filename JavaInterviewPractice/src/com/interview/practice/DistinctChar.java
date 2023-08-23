package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class DistinctChar {

	public static void main(String[] args) {

		String str = "aabbccvvkkll";
		
		HashMap<Character, Integer> hm=new <Character, Integer>HashMap();
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				continue;
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> en:hm.entrySet())
		{
			System.out.print(en.getKey());
		}
	}

}
