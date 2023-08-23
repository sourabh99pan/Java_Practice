package com.interview.practice;

import com.test.TestClass;

public class DifferentWaysObj {

	public void display()
	{
		System.out.println("in display");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		
		DifferentWaysObj obj = DifferentWaysObj.class.newInstance();
		
		obj.display();
		
		System.out.println(obj.hashCode());
		
}
}