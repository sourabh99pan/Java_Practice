package com.interview.practice;

import java.util.Scanner;

public class CountOfaChars {

	public static void main(String[] args) {
		String str ="";
		int l,i,count=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		str = sc.next();
		
		
		
		l = str.length();
		
		System.out.println(l);
		for(i=0;i<l;i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
	
		}
		
		System.out.println("Count of char a is: "+count);
	}

	}


