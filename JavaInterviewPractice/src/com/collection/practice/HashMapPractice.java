package com.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new <Integer,String>HashMap();

		hm.put(1, null);
		hm.put(null, null);
		hm.put(2, "Sourabh");
		hm.put(3, "Rahul");
		hm.put(4, "Sachin");
		hm.put(null, null);

		for(Map.Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
