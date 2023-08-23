package com.interview.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringArrayIdentical {

	public static void main(String[] args) {
		String [] str1={"A", "B","C","A"};
		String [] str2 = {"A", "A","C","B"};
		boolean flag=true;
		HashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<str1.length;i++)
		{
			if(hm1.containsKey(str1[i]))
			{
				hm1.put(str1[i], hm1.get(str1[i])+1);
			}
			else
			{
				hm1.put(str1[i], 1);
			}
		}
		
		for(int i=0;i<str2.length;i++)
		{
			if(hm2.containsKey(str2[i]))
			{
				hm2.put(str2[i], hm2.get(str2[i])+1);
			}
			else
			{
				hm2.put(str2[i], 1);
			}
		}

		if(hm1.equals(hm2))
		{
			System.out.println("Identical");
		}
		else
		{
			System.out.println("Not identical");
		}

	}

}
