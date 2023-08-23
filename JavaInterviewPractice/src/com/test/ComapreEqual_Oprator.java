package com.test;

public class ComapreEqual_Oprator {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println(s1==s2); //checking the object memory
		System.out.println(s1.equals(s2));//checking the object values
	}

}
