package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class SortingNumbers {

	public static void main(String[] args) {

		String str="78,-89,10,23,99,0,30,3,100";
		ArrayList<Integer> arr = new <Integer>ArrayList();
		
		String strArr[] = str.split(",");
		
		for(int i=0;i<strArr.length;i++)
		{
			arr.add(Integer.parseInt(strArr[i]));
		}
		
		Iterator it = arr.iterator();
		
		for(int j=0;j<arr.size();j++)
		{
			System.out.println(arr.get(j));
		}
		
		for(int k=0;k<arr.size();k++)
		{
			for(int l=1;k<arr.size();l++)
			{
				if(arr.get(l)>arr.get(k))
				{
					int temp = arr.get(l);
					//arr.get(l) =arr.get(k);
					//arr.get(k) =temp;
				}
			}
		}
	}

}
