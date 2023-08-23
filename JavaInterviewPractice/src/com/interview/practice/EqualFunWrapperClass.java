package com.interview.practice;

import com.test.TestClass;

public class EqualFunWrapperClass {

	public static void main(String[] args)
	{
		String str = "Hello";
		String str1 = "Hello";
		
		if(str.equals(str1))
		{
			System.out.println("Equal Strings");
		}
		
		
		Integer i = new Integer(1);
		
		Integer i1 = new Integer(1);
		
		
		if(i.equals(i1))
		{
			System.out.println("Equal Integers");
		}
		
		TestClass obj = new TestClass();
		
		TestClass obj1 = new TestClass();
		
		if(obj.equals(obj1))
			
		{
			System.out.println("Objects Equal");
		}
		else
		{
			System.out.println("Objects not Equal");
		}

}

}
