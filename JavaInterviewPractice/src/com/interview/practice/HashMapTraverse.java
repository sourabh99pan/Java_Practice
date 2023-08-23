package com.interview.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {
	public static void main(String[] args)
	
	{
		String str="geekforgreeksssk";
		
		char c[] = str.toCharArray();
		
		ArrayList<Character> arrList = new <Character>ArrayList();
		HashMap<Character,Integer> hm =new <Character,Integer>HashMap();
		
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
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey());
		}
	}

}
