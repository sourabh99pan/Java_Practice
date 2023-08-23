package com.interview.practice;

public class ReplaceChars {

	public static void main(String[] args) {
		
		String str = "Sourabh@%^13452";
		
		//it will display special chars
		System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
		
		//it will display chars without special chars
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
