package com.collection.practice;

import java.util.*;

public class ListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> alt = new ArrayList<>(Arrays.asList(1,45,66,33,87,47));
		
		int arr[] = new int[alt.size()];
		int i=0;
		for(int a:alt)
		{
			arr[i]=a;
			i++;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
