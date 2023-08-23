package com.interview.practice;

public class ReplaceSubStringWithoutReplace {

	public static void main(String[] args) {
		
		String str = "I use selenium webdriver. selenium is a tool for web applications automation";
		
		String tobeReplace = "selenium";
		String willReplace = "firefox";
		
		String [] strArr = str.split(tobeReplace);
		
		StringBuffer str2 = new StringBuffer();
		
		for(int i=0;i<strArr.length;i++)
		{
			str2.append(strArr[i]);
			if(i!=strArr.length-1)
			str2.append(willReplace);
			System.out.println(str2);
		}
		
		System.out.println(str2);

	}

}
