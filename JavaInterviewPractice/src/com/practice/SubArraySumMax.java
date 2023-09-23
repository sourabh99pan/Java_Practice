package com.practice;

public class SubArraySumMax {

	public static void main(String[] args) {
		int arr[] = {21,34,22,65,43,22,65,25,89};
		
		int s = 4;
		int sum=0;
		int sumall=0;
		int n=0;
		for(int i=0;i<=arr.length-s;i++)
		{
			for(int j=i;n<s;j++)
			{
				sum=sum+arr[j];
				sumall=Math.max(sumall, sum);
				n++;
				
			}
			sumall=Math.max(sumall, sum);
			sum=0;
			n=0;
		}
		
		System.out.println("Largest sum of subarray length 3 is: "+sumall);

	}

}
