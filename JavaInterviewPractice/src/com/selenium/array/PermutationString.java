package com.selenium.array;

public class PermutationString {
	
	public static String swap(int i, int j, String str)
	{
		char cArr[] = str.toCharArray();
		char c;
		c = cArr[i];
		cArr[i] = cArr[j];
		cArr[j]=c;
		return String.valueOf(c);
	}
	
	public static void permutationString(int start, int end, String str1)
	{
		if(start==end)
		{
			System.out.println(str1);
		}
		else
		{
			for(int i=start;i<end;i++)
			{
				str1=swap(start, end, str1);
				permutationString(start+1, end, str1);
				str1=swap(start, end, str1);
			}
			
		}
	}

	public static void main(String[] args) {
		
		String str="abc";
		
		int l = str.length();
		
		System.out.println("Permutation of string are");
		
		permutationString(0,l-1,str);
		
		
		

	}

}
