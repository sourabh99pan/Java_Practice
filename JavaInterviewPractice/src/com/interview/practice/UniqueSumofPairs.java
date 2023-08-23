package com.interview.practice;

import java.util.HashMap;

public class UniqueSumofPairs {

	public static void main(String[] args) {
		
	    int arr[] = {1,2,5,1,3,7,6,4,4,3,7,8,1,1,4};
	    
	    HashMap<Integer, Integer> hm = new <Integer, Integer>HashMap();
	    
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=i+1;j<arr.length;j++)
	        {
	            if(arr[i]+arr[j]==10)
	            {
	                if(hm.containsKey(arr[i]) || hm.containsKey(arr[j]))
	                {
	                    continue;
	                }
	                else{
	                    hm.put(arr[i],1);
	                    hm.put(arr[j],1);
	                    System.out.println("Pairs are "+ arr[i]+" and "+arr[j]);
	                }
	               
	                
	            }
	        }
	    }

	}

}
