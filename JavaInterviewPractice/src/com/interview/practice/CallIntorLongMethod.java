package com.interview.practice;



public class CallIntorLongMethod {

	public void sum(int a, int b)
	{
		System.out.println("Method a");
	}

	public void sum(long a, int b)
	{
		System.out.println("Method b");
	}

	
	public static void main(String[] args)
	{
		CallIntorLongMethod obj = new CallIntorLongMethod();
		obj.sum(10L, 20);
}

}
