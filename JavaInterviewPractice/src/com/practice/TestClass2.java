package com.practice;

import java.util.*;


public class TestClass2 {

	public static void main(String[] args) {
		int arr[] = {21,34,22,65,43};
		
		int pos=3;
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			ll.add(arr[i]);
		}
		
		for(int i=0;i<pos;i++)
		{
			ll.addLast(ll.get(0));
			ll.removeFirst();
		}
		
		System.out.println(ll);

	}
}
