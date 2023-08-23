package com.interview.practice;

public class SortingNumFromString {
	
	public static void main(String[] args) {
		
		String str = "78,-89,10,23,99,0,30,3,100";
		
		String[] strArr = str.split(",");
		
		System.out.println(strArr.length);
		
		int [] alist = new int [strArr.length];
		
		for(int i=0;i<strArr.length;i++)
		{
			alist [i]=Integer.parseInt(strArr[i]);
		}
		
		
		for(int j=0;j<alist.length;j++)
		{
			int temp;
			for(int i=j+1;i<alist.length;i++)
			{
				if(alist[j]>alist[i])
				{
					temp=alist[j];
					alist[j]=alist[i];
					alist[i]=temp;
				}
			}
		}
		
		
		
		System.out.println("Increasing order:");
		
		for(int j=0;j<alist.length;j++)
		{
			System.out.println(alist[j]);
		}
		
		System.out.println("decreasing order:");
		for(int j=alist.length-1;j>=0;j--)
		{
			System.out.println(alist[j]);
		}
		
		
		
		

	}
}