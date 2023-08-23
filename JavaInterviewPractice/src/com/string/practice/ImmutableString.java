package com.string.practice;

public class ImmutableString {

	public static void main(String[] args) {
		
		String s = "Hello";
		String s1 = "Hello";
		
		String s2 = new String("Hello");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s =s.concat("world");
		System.out.println(s.hashCode());
		
		s1="Sourabh";
		System.out.println(s1.hashCode());
		

	}

}
