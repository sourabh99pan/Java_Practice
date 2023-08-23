package com.selenium.array;

public class LeftRotate {

	public static void main(String[] args) {
		
		int arr[] = {21,34,22,65,43};
		int n=4;
		
		System.out.println("Array before rotate:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		for(int j=0;j<n;j++)
		{
			int k,first;
			
			first=arr[0];
			for(k=0;k<arr.length-1;k++)
			{
				arr[k]=arr[k+1];
			}
			arr[k]=first;
		}
		
		System.out.println();
		System.out.println("After rotation");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
