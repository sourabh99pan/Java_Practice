package com.practice;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		
		String str = "Sourabh is working in IT company";
		
		Scanner sc = new Scanner(System.in);
		
		Boolean flag =true;
		
		System.out.println("Enter any string: ");
		String inputString = sc.next();
		
		
		String [] str1 = str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].equals(inputString))
			{
				flag =true;
				break;
			}
			
			else
			{
				flag =false;
			}
		
		}
		
		if(flag)
		{
			System.out.println(inputString+" is present");
		}
		else
		{
			System.out.println(inputString+" is not present");
		}
	}

}
