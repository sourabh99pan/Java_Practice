package com.interview.practice;

public class CountOfCharsInString {

	public static void main(String[] args) {
		String str = "Bhuvneshwarababab";
		int count=0;

	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		
		System.out.println("Number of characters: "+count);

	}

}
