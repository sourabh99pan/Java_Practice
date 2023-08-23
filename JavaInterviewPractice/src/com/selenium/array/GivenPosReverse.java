package com.selenium.array;

public class GivenPosReverse {

	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10};
		 int pos=5;
		 
		 System.out.println("Initial array is: ");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 for(int i=0;i<pos/2;i++)
		 {
			 int temp=arr[i];
			 arr[i]=arr[pos-i-1];
			 arr[pos-i-1]=temp;
		 }
		 
		 System.out.println("modified array is: ");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

}
