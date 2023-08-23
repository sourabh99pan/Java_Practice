package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapSort {

	public static void main(String[] args) {
	       String str = "Java Java Selenium Python Python Python";
	       
	       String [] strArr = str.split(" ");
	       
	       HashMap<String, Integer> hm = new <String, Integer>HashMap();
	       LinkedHashMap<String, Integer> lhm = new <String, Integer>LinkedHashMap();
	       ArrayList<Integer> alist = new <Integer>ArrayList();
	       
	       for(int i=0;i<strArr.length;i++)
	       {
	           if(hm.containsKey(strArr[i]))
	           {
	               hm.put(strArr[i],hm.get(strArr[i])+1);
	           }
	           else
	           {
	               hm.put(strArr[i],1);
	           }
	       }
	    
	    	for(Map.Entry<String,Integer> e:hm.entrySet())
	    	{
	    		alist.add(e.getValue());
	    	}
	       
	    System.out.println(hm);
	    
	    Collections.sort(alist, Collections.reverseOrder());
	    
	    for(int num:alist)
	    {
	    	for(Map.Entry<String,Integer> e:hm.entrySet())
	    	{
	    		if(e.getValue()==num)
	    		{
	    			lhm.put(e.getKey(), num);
	    		}
	    	}
	    }
	    
	    System.out.println(lhm);
	}

}
