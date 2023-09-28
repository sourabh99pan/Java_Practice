package com.practice;
import java.util.*;

public class Test4 {
	
	

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new <Integer, String>HashMap();
		
		hm.put(1, "Sourabh");
		hm.put(2, "Sourabh");
		hm.put(3, "Sourabh");
		hm.put(4, "Sourabh");
		
		for(Map.Entry<Integer, String> en:hm.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		for(int i:hm.keySet())
		{
			System.out.println(hm.get(i));
		}
		
	}

}
