package com.interview.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "night";
		String s2 = "thing";

		int l1 = s1.length();
		int l2 = s2.length();
		int len;
		boolean flag = true;

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		len = arr1.length;

		for (int i = 0; i < len; i++) {
			if (arr1[i] == arr2[i]) {
				continue;
			} else {
				flag = false;
				break;
			}
		}

		if (flag == true && l1 == l2) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not a anagram");
		}

	}

}
