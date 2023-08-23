package com.interview.practice;

import java.util.Scanner;

public class SumOfPair {

	public static void main(String[] args) {
		
		
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]+arr[j+1]==10)
			{
				System.out.println("Pairs: "+arr[j]+" and "+arr[j+1]);
			}
		}

	}

}
