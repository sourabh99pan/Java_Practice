package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class TestCLass {

	public static void main(String[] args) {


		String str = "aaafffaaffwq";
		int count=0;
		char c[] = str.toCharArray();
		HashSet <Character> ch = new HashSet<Character>();
		StringBuffer str1 = new StringBuffer();
		HashMap<Character, Integer> hm = new <Character, Integer>HashMap();
		//MultiMap<String, String> map = new MultiValueMap<>();
		for(char c1:c)
		{
			ch.add(c1);
		}
		
		for(char c1:ch)
		{
			for(int i=0;i<c.length;i++)
			{
				if(c1==c[i])
				{
					if(hm.isEmpty())
					{
						count++;
					}
					
				}
				else
				{
					
					
					
				}
				
			}
			hm.put(c1, count);
			System.out.println(hm.keySet()+""+hm.values());
			hm.clear();
			count=0;
		}
		
		
	}

		
		
	}


