package com.interview.practice;

import java.util.HashMap;

public class CountofCharsInEveryString {

	
	public static void main(String[] args)
	
	{
		String str = "This is my Project. This is my home";
		String strArr[] =str.split(" ");
		int count=0;
		HashMap<String,Integer>hs =new <String,Integer>HashMap();

	for(int i=0;i<strArr.length;i++)
	{
		for(int j=0;j<strArr[i].length();j++)
		{
			if(strArr[i].charAt(j)!=' ')
			{
				count++;
			}

		}
		if(hs.containsKey(strArr[i]))
		{
		hs.put(strArr[i], hs.get(strArr[i])+count);
		}
		else
		{
			hs.put(strArr[i], count);
		}
		count=0;

	}
	System.out.println("Number of characters: "+hs);
}

}