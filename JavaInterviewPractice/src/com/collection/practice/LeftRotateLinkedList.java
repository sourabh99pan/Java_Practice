package com.collection.practice;

import java.util.LinkedList;

public class LeftRotateLinkedList {

	public static void main(String[] args) {
		int arr[] = { 21, 34, 22, 65, 43 };

		LinkedList<Integer> ll = new LinkedList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			ll.add(arr[i]);
		}

		int p = 3;

		for (int i = 0; i < p; i++) {
			ll.addLast(ll.get(0));
			ll.removeFirst();
		}

		System.out.println(ll);

	}

}
