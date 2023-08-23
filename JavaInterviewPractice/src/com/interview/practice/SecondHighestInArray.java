package com.interview.practice;

public class SecondHighestInArray {

	public static void main(String[] args) {

		int arr[] = {1,2,54,45,23,67,22,55};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Second highest is "+arr[arr.length-2]);
	}

}
