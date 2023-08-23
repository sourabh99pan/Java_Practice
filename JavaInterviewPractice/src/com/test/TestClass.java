package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public  class  TestClass {


	public static void main(String[] args)
	
	{

		int arr[] = {21,34,22,65,43};
		int n=2;
		
		System.out.println("Array before rotate: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			int first=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		
		System.out.println("");
		System.out.println("Array after rotate: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}	
	
}

