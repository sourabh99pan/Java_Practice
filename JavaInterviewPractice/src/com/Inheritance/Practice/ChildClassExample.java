package com.Inheritance.Practice;

public class ChildClassExample extends ParentClassExample{
	
	int child;
	ChildClassExample(){
		super("Chrome");
		//System.out.println("I am in Child class constructor");
	}

	public void childFunc()
	{
		System.out.println("I am in Child class"+child);
	}
}
