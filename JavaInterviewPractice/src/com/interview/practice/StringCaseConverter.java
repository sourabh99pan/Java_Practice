package com.interview.practice;

public class StringCaseConverter {

	public static void main(String[] args) {

		String str = "PersistentABC";
		StringBuffer buff = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{	char c =str.charAt(i);
			if(Character.isLowerCase(c))
			{
				buff.append(Character.toUpperCase(c));
			}
			else
			{
				buff.append(Character.toLowerCase(c));

			}
		}
		
		System.out.println(buff);

	}

}
