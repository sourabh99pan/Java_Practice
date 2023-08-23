package com.practice;

public class Test4 {
	
	

	public static void main(String[] args) {
		
		String str ="mad";
		
		int num = 122;
		int r=0;
		int temp =num;
		String rev = "";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(rev.equals(str))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not a palindrom");
		}
		
		
		while(temp>0)
			
		{
			int rem= temp%10;
			
			 r = r*10+rem;
			 
			 temp =temp/10;
			
		}
		
		if(r==num)
		{
			System.out.println("num is palindrom");
		}
		else
		{
			System.out.println("num is not a palindrom");
		}
	}

}
