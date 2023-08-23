package com.interview.practice;

public class PetersonNumber {

	public static void main(String[] args) {
	int a =145;
		
		int temp =a;
		
		int rem =0;
		
		int fact=1;
		
		int num =0;
		
		while(temp>0)
			
		{
			rem =temp%10;
			
			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			
			num =num+fact;
			
			temp =temp/10;
			fact =1;
		}
	
System.out.println(num);

	if(num==a)
	{
		
		System.out.println("It is peterson number");
	}
	else
	{
		System.out.println("It is not a peterson number");
	}

	}

}
