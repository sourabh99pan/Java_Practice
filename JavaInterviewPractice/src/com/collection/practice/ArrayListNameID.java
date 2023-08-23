package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListNameID {

	public static void main(String[] args) {


	String str = "javaconceptoftheday";
	
	int i=0;
	int max=0;
	int j=0;
	
	HashSet<Character> hs =new <Character>HashSet();
	
	while(i<str.length())
	{
		if(!hs.contains(str.charAt(i)))
		{
			hs.add(str.charAt(i));
			i++;
			max = Math.max(hs.size(), max);
		}
		else
		{
			hs.remove(str.charAt(j));
			j++;
		}
	}
	
	System.out.println(max);
	}

}
