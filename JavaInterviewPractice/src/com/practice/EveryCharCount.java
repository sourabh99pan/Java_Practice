package com.practice;

public class EveryCharCount {

	public static void main(String[] args) {
		
		String str = "aabbccabgftyb";
		int count=1;
		char c = str.charAt(0);
		StringBuffer b = new StringBuffer();
		for(int i=1;i<str.length();i++)
		{
			if(c==str.charAt(i))
			{
				count++;
			}
			else
			{
				b.append(c).append(count);
				c = str.charAt(i);
				count=1;
			}
		}
		
		b.append(c).append(count);
		System.out.println(b);

	}

}
