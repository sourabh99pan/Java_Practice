package com.practice;

public class MissingValueFromArray {

	public static void main(String[] args) {

		//int[] arr = {1,9,14,11,7,13};
		int arr [] ={1, 2, 4, 6, 3, 7, 8,10,5};
		int n=arr.length;
		
		int sum=((n+1)*(n+2))/2;
		
		System.out.println(sum);
		for(int i=0;i<n;i++)
		{
			//System.out.println(arr[i]);
			sum-=arr[i];
			System.out.println(sum);
		}
		
		System.out.println(sum);
	}

}
