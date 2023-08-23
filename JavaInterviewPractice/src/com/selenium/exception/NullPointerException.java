package com.selenium.exception;

public class NullPointerException {

	public static void main(String[] args) {
		
		String str=null;
		
		if(str.equals("David"))
		{
			System.out.println("it is david");
		}
		else
		{
			System.out.println("it is not david");
		}

	}

}
