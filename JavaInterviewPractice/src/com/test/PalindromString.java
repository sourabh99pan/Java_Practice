package com.test;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		String original,reverse ="";
		
		System.out.println("Enter a string ");
		
		Scanner sc=new Scanner(System.in);
		
		original = sc.next();
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		
		if(original.equals(reverse))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
	}

}
