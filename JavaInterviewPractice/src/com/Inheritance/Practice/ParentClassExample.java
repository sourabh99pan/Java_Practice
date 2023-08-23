package com.Inheritance.Practice;

public class ParentClassExample {

	int parent;
	String Browser;
	ParentClassExample()
	{
		System.out.println("I am in Parent class constructor");
	}
	
	ParentClassExample(String browser)
	{
		Browser =browser;
		System.out.println("I am in Parent class parametrized constructor:");
		parentFunc(Browser);
	}

	public void parentFunc(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.out.println("i am in chrome browser");
		}
		else if(browser.equals("Mozila"))
		{
			System.out.println("i am in Mozila browser");
		}
		else
		{
			System.out.println("i am in edge browser");
		}
				
}
}