package com.interview.practice;

public class PreserveSpacePosition {

	public static void main(String[] args) {
		
		String str = "I am not String";
		
		char [] c = str.toCharArray();
		
		int s = 0;
		int e=str.length()-1;
		
		while(s<e)
		{
			if(c[s]==' ')
			{
				s++;
			}
			else if(c[e]==' ')
			{
				e--;
			}
			else
			{
				char temp = c[s];
				c[s]=c[e];
				c[e]=temp;
				s++;
				e--;
			}
		}
		
		System.out.println(String.valueOf(c));
	}

}
