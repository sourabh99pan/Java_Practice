 package com.interview.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
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
		System.out.println(a+" Number is prime");
		}
		else
		{
			System.out.println(a+" Number is not prime number");
		}
	}

}
