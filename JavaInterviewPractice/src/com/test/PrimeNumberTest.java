package com.test;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		boolean prime=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				 prime=false;
				 break;
			}
		}
		
		
		if(prime)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is a not prime number");
		}
	}

}
