package com.string.practice;

public class NumberStringInArray {

	public static void main(String[] args) {
		
		String[] arr = {"abcd", "Pune", "623", "Mumbai", "10"};
		int num=0;
		int word=0;
		
		for(int i=0;i<arr.length;i++)
		{
			try {
				
				int x= Integer.parseInt(arr[i]);
				num++;
				
			}
			catch(NumberFormatException e)
			{
				word++;
			}
		}
		
		System.out.println("number: "+num);
		System.out.println("word: "+word);

	}

}
