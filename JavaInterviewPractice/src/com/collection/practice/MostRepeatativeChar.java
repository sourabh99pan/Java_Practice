package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatativeChar {

	public static void main(String[] args) {
		String str = "JavaConceptOfTheDayCC";
		char c[] = str.toCharArray();
		LinkedHashMap<Character, Integer> hm = new <Character, Integer>LinkedHashMap();
		ArrayList<Integer> alist = new ArrayList<Integer>();

		for (int i = 0; i < c.length; i++) {
			if (hm.containsKey(c[i])) {
				hm.put(c[i], hm.get(c[i]) + 1);
			} else {
				hm.put(c[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			{
				// System.out.println(e.getKey()+" "+e.getValue());
				alist.add(e.getValue());
			}

		}

		Collections.sort(alist);

		System.out.println(alist.get(alist.size() - 1));

		System.out.println("Most reptative letter below: ");
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			{
				if (e.getValue() == alist.get(alist.size() - 1)) {
					System.out.println(e.getKey());
					// break;
				}
			}

		}
	}

}
