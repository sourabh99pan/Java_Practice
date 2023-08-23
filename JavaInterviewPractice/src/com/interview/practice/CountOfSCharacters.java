package com.interview.practice;

import java.util.Scanner;

public class CountOfSCharacters {

	public static void main(String[] args) {
		String str ="";
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		str = sc.next();
		
		
		int l,i,capital=0,small=0,num=0;
		
		l=str.length();
		
		for(i=0;i<l;i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				
				capital++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				small++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				num++;
			}
		}
		
		System.out.println("capital letter count: "+capital);
		
		System.out.println("small letter count: "+small);
		
		System.out.println("number count: "+num);
	}

}
