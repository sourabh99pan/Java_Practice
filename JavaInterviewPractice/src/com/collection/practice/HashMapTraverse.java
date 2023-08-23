package com.collection.practice;
import java.util.*;
public class HashMapTraverse {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new <Integer, String>HashMap();
		
		hm.put(1, "Python");
		hm.put(2, "Java");
		hm.put(3, "JavaScript");
		hm.put(4, "Ruby");
		
		//traverse through key value
		
		for(Map.Entry<Integer, String> en:hm.entrySet())
		{
			System.out.println("Key is: "+en.getKey()+" and Value is "+en.getValue());
		}
		
		//iterating through keys
		for(int i:hm.keySet())
		{
			System.out.println("for Key "+i+" value is "+hm.get(i));
		}
		
		//iterating through values
		for(String str:hm.values())
		{
			System.out.println(str);
		}
		
		
		//Iterating through iterator
		Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
