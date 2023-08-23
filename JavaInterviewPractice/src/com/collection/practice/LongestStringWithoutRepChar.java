package com.collection.practice;

import java.util.HashSet;

public class LongestStringWithoutRepChar {

	public static void main(String[] args) {
		String s = "abcnjjksnaeaarty";
		int i =0;
		int j=0;
		int max=0;
		
		HashSet<Character> hs =new <Character>HashSet();
		
		while(j<s.length())
		{
			if(!hs.contains(s.charAt(j)))
			{
				hs.add(s.charAt(j));
				j++;
				max = Math.max(hs.size(), max);
				
			}
			else
			{
				
				hs.remove(s.charAt(i));
				i++;
			}
			
			
		}
		
		System.out.println("Longest String without Repeated Chars is: "+max);

	}

}
