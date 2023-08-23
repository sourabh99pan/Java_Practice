package com.interview.practice;

public class ToggleReverse {

	public static void main(String[] args) {

		String sample = "Hello How are you";
		StringBuffer b = new StringBuffer();
		
		String [] strArr = sample.split(" ");
		
		for(int i=0;i<strArr.length;i++)
		{
			for(int j=strArr[i].length()-1;j>=0;j--)
			{
				b.append(strArr[i].charAt(j));
			}
			
			b.append(" ");
		}
		
		System.out.println(b);
	}

}
