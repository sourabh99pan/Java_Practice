package com.interview.practice;

public class DuplicateString {

	public static void main(String[] args) {

		String s = " Hello There how Hello There";
		
		String str[] = s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println(str[i]);
				}
			}
		}
	}

}
