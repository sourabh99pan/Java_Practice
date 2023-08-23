package com.string.practice;

public class WordsReverse {

	public static void main(String[] args) {
		String str ="This is new WPT Project";
		
		String strArr[] = str.split(" ");
		
		System.out.println("Normal String sequence");
		for(int i=0;i<strArr.length;i++)
		{
			System.out.println(strArr[i]);
		}
		
		System.out.println("");
		
		System.out.println("Reverse String sequence");
		for(int i=strArr.length-1;i>=0;i--)
		{
			System.out.println(strArr[i]);
		}
		
		System.out.println("");
		
		for(int i=strArr.length-1;i>=0;i--)
		{
			for(int j=strArr[i].length()-1;j>=0;j--)
			{
				System.out.println(strArr[i].charAt(j));
			}
		}
		

	}

}
