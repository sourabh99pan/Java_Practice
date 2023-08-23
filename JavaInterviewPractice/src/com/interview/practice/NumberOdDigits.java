package com.interview.practice;

public class NumberOdDigits {

	public static void main(String[] args) {
		int n=123456;
		int a=n;
		int count=0;
		
		while(a>0)
		{
			int rem=a%10;
			count++;
			a=a/10;
		}
		
		System.out.println(count);

	}

}
