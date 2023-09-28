package com.practice;

import java.util.*;


public class TestClass2 {

	public static void main(String[] args) {

		String str = "Hello";
		
		System.out.println(str.hashCode());
		
		String str1 = "Hello";
		
		System.out.println(str1.hashCode());
		
		str = str.concat("World");
		
		System.out.println(str.hashCode());
		
		StringBuffer b = new StringBuffer();
		
		b.append("abc");
		
		System.out.println(b.hashCode());
		
		b.append("xyz");
		
		System.out.println(b.hashCode());
		
				

		
	}
}
