package com.interview.practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		String original,reverse="";
		
		Scanner sc =new Scanner(System.in);
		
		original = sc.next();
		
		System.out.println("Original String: "+original);
		
		int i,l;
		l=original.length();
		for(i=l-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		
		System.out.println("Reverse string: "+reverse);
	}

}
