package com.practice;

import java.util.*;

public class HashTablePractice {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht =new <Integer, String>Hashtable();
		
		ht.put(1, "Sourabh");
		ht.put(2, "David");
		ht.put(3, "Smith");
		ht.put(4, "Waka");
		
		Set<Integer> setOfKeys=ht.keySet();
		
		for(Integer e:setOfKeys)
		{
			System.out.println("Key is "+ht.get(e)+" and value is "+e);
		}
		
		for(Map.Entry<Integer, String> e:ht.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
