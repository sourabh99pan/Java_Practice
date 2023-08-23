package com.interview.practice;

import java.util.Scanner;

public class DuplicateValuesPrint {

	public static void main(String[] args) {
		int arr[] =new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]==arr[k])
				{
					System.out.println(arr[k]);
				}
			}
		}

	}

}
