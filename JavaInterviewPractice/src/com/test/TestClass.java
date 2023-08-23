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
		String [] arr1= {"A", "B","C","A"};
		
		String []arr2 = {"A", "A","C","B"};
		
		boolean flag=true;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==arr2[i])
			{
				continue;
			}
			else
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Identical");
		}
		else
		{
			System.out.println("not identical");
		}
	}	
	
}

