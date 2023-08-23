 package com.interview.practice;

public class SwapStringsWithoutThirdVariable {

	public static void main(String[] args) {

		String str1 = "Sourabh";
		String str2 = "Pandya";
			
		System.out.println("String 1 before swapping: "+str1);
		
		System.out.println("String 2 before swapping: "+str2);
		
		str1=str1.concat(str2);
		
		str2 = str1.substring(0,str1.length()-str2.length());
		
		str1=str1.substring(str2.length());//substring start from this value
		System.out.println("String 1 after swapping: "+str1);
		
		System.out.println("String 2 after swapping: "+str2);
	}

}
