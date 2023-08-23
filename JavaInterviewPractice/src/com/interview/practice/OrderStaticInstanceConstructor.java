package com.interview.practice;

import com.test.TestClass;

public class OrderStaticInstanceConstructor {
	
	//1st this will call
	static
	{
		System.out.println("I am in static block");
	}
	
	//2nd now this will call
	{
		System.out.println("I am in instance block");
	}
	
	//3rd this will call after object created
	OrderStaticInstanceConstructor()
	{
		System.out.println("I am in constructor");
		
	}
	public static void main(String[] args) {
		
		OrderStaticInstanceConstructor obj =new OrderStaticInstanceConstructor();
		
		System.out.println("In main function");


}
}