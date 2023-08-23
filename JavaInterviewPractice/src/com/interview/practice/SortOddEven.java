package com.interview.practice;

import java.util.ArrayList;

public class SortOddEven {

	public static void main(String[] args) {
	    int [] arr = {2,7,4,7,3,6,9,10,12,1,03,19};
	    ArrayList<Integer> alist = new <Integer>ArrayList();
	    for(int i=0;i<arr.length;i++)
	    {
	      if(arr[i]%2!=0)
	      {
	        alist.add(arr[i]);
	      }
	    }
	     for(int j=0;j<arr.length;j++)
	    {
	      if(arr[j]%2==0)
	      {
	        alist.add(arr[j]);
	      }
	    }
	     
	     System.out.println(alist);
	}

}
