package com.test;

import java.util.Scanner;

public class FabonnaciTest {

	public static void main(String[] args) {
		
		
		int n1=0,n2=1,n3;
		
		System.out.println("Enter a number:");
		
		Scanner sc =new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.print(n1);
		System.out.print(n2);
		
		for(int i=0;i<a;i++)
		{
			n3=n1+n2;
			System.out.print(n3);
			
			n1=n2;
			n2=n3;
		}
		
	}
	
}
