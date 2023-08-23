package com.test;

import com.interview.practice.SortingNumFromString;

public class SelectionSorting {

	int pos=0;
	int temp;
	public void sorting(int [] a)
	{
		
		System.out.println("in sorting function");
		for(int i=0;i<a.length;i++)
		{
			pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[pos])
				{
					pos =j;
				}
			}
			
			temp = a[pos];
			a[pos]= a[i];
			a[i]=temp;
			
			
		}
		
	}
	
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	//selection sort
	public static void main(String[] args) {
		
		int [] arr = {45,34,21,55,66,78};
		
		SelectionSorting obj = new SelectionSorting();
		
		obj.sorting(arr);
		
		obj.display(arr);		

	}
}
