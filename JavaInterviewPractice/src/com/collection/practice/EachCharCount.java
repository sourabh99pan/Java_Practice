package com.collection.practice;

import java.util.HashSet;

public class EachCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaafffaaffwq";
		int count=1;
		char curr=str.charAt(0);
		StringBuffer buff = new StringBuffer();
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==curr)
			{
				count++;
			}
			else
			{
				buff.append(curr).append(count);
				curr=str.charAt(i);
				count=1;
			}
		}
		
		buff.append(curr).append(count);
		System.out.println(buff);

	}

}
