package com.interview.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a  = 153;
		int arm =0;
		int num=0;
		int temp=a;
		
		
		
		while(a>0)
		{
			num = a%10;
			a = a/10;
			
			arm =arm+num*num*num;
			
		}
		
		if(temp==arm)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not a armstrong");
		}

	}

}
