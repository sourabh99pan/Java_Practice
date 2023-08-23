package com.test;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {

		System.out.println("enter a number ");
		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		int r,sum=0;
		int p = a;
		while(a>0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		
		if(sum==p)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
	}

}
