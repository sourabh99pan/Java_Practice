package com.selenium.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		String s = "Hello There how Hello There";

		String[] strArr = s.split(" ");

		ArrayList<String> alist = new ArrayList<String>(Arrays.asList(strArr));

		/*
		 * for(int i=0;i<strArr.length;i++) { alist.add(strArr[i]); }
		 */

		ArrayList<String> unique = new ArrayList<String>();

		for (int i = 0; i < alist.size(); i++) {
			if (!unique.contains(alist.get(i))) {
				unique.add(alist.get(i));
			}
		}

		System.out.println(unique);

	}

}
