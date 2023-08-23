package com.collection.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepetativeNNonRepetativeChars {

	public static void main(String[] args) {
		String str = "JavaConceptOfTheDay";
		char c[] = str.toCharArray();
		LinkedHashMap<Character, Integer> hm = new <Character, Integer>LinkedHashMap();

		for (int i = 0; i < c.length; i++) {
			if (hm.containsKey(c[i])) {
				hm.put(c[i], hm.get(c[i]) + 1);
			} else {
				hm.put(c[i], 1);
			}
		}
		
		System.out.println("First Non reptative letter below: ");

		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}

		}
		
		System.out.println("First reptative letter below: ");
		
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey());
				break;
			}

		}

	}

}
