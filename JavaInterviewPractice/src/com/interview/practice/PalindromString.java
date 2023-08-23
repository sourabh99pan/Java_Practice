package com.interview.practice;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		String original, reverse="";
		int i,l;
		
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		original = sc.next();
		
		 l=original.length();
		
		for(i=l-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		
		if(original.equals(reverse))
			   System.out.println("palindrome String ");    
			  else    
			   System.out.println("not palindrome String"); 
		
	}

}
