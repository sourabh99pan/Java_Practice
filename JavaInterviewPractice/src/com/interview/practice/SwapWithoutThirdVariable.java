package com.interview.practice;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int a=5;
		int b=6;
		
		System.out.println("Before Swapping a value is: "+a);
		System.out.println("Before Swapping b value is: "+b);
		
		a=a+b;
		b=a-b;
		
		a=a-b;
		
		System.out.println("After Swapping a value is: "+a);
		System.out.println("After Swapping b value is: "+b);
	}

}
