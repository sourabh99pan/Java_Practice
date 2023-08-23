package com.string.practice;

import java.util.*;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		
		String str = "JavatgnsooobnkJtV45HKH";
		
		HashMap<Character, Integer> hm = new <Character, Integer>HashMap();
		
		StringBuffer strb = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				continue;
			}
			else
			{
				hm.put(str.charAt(i), 1);
				strb.append(str.charAt(i));
			}
		}
		
		System.out.println(strb);
		

		
		

	}

}
