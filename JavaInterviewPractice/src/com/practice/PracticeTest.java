package com.practice;

public class PracticeTest {

	public static void main(String[] args) {
		
		int [] arr = {1,43,5,6,44,33,6,8,-9,-12};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		for(int k=arr.length-1;k>=0;k--)
		System.out.println(arr[k]);
		
	}

}