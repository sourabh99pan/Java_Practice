package com.selenium.exception;

public class TestCustomException {
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is invalid");
		}
		else
		{
			System.out.println("age is valid");
		}
	}

	public static void main(String[] args)  {
		
		try {
			validateAge(15);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}

	}

}
