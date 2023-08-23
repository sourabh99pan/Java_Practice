package com.collection.practice;

import java.util.*;

public class TestClass {

	public static void main(String[] args) {

		String str = "This is my Project";
		char c[] =str.toCharArray();
		
		int s=0;
		int e=c.length-1;
		
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
				char temp=c[s];
				c[s]=c[e];
				c[e] = temp;
				s++;
				e--;
			}
		}
		
		System.out.println(String.valueOf(c));
		

	}

}

	


