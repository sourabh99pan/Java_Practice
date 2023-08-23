package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(1, "Sourabh");
		lhm.put(2, "Dravid");
		lhm.put(3, "Sachin");
		
		for(Map.Entry<Integer, String> hm:lhm.entrySet())
		{
			System.out.println(hm.getValue());
		}

	}

}
