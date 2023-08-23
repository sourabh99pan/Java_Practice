package com.test;

public class TestProgram {
	
	static int a=10;
	int b=10;
	public void fun()
	{
		
		
		System.out.println(a+" "+b);
		a++;
		b++;
		
	}

	public static void main(String[] args) {

		TestProgram ref = new TestProgram();
		ref.fun();
		ref.fun();
		
	}

}
