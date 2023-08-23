package com.interview.practice;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfChars {

	public static void main(String[] args) {

		String str ="";
		int l,i;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		str = sc.next();
		
		HashMap<Character,Integer> hs = new <Character,Integer>HashMap();
		
		l = str.length();
		
		System.out.println(l);
		for(i=0;i<l;i++)
		{
			if(hs.containsKey(str.charAt(i)))
			{
				hs.put(str.charAt(i), hs.get(str.charAt(i))+1);
			}
			else
			{
				hs.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(hs);
	}

}
