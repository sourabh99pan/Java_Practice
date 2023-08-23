package com.interview.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestProgramClass {


	public static void main(String[] args) {
		

		String str = "78,-89,10,23,99,0,30,3,100";
		
		String [] strArr = str.split(",");
		
		int [] alist = new int[strArr.length];
		
		for(int i=0;i<strArr.length;i++)
		{
			alist[i]=(Integer.parseInt(strArr[i]));
		}
		
		for(int i=0;i<alist.length;i++)
		{
			for(int j=i+1;j<alist.length;j++)
			{
				int temp=0;
				if(alist[i]>alist[j])
				{
					temp=alist[i];
					alist[i]=alist[j];
					alist[j]=temp;
				}
				
			}
		}
		
		for(int j=0;j<alist.length;j++)
		{
			System.out.print(" "+alist[j]);
		}
	}		
	
}