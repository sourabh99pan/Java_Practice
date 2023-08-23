package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntoArray {

	public static void main(String[] args) {
		List<Integer> all = new <Integer> ArrayList();
		
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(40);
		
		int [] arr = new int[4];
		
		for(int i=0;i<all.size();i++)
		{
			arr[i] = all.get(i);
		}
		
		for(int j=0;j<arr.length;j++)
		{
		System.out.println(arr[j]);
		}

	}

}
