package com.interview.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int leapYear = sc.nextInt();
		
		if(leapYear%4==0 && leapYear%100!=0 ||leapYear%400==0)
		{
			System.out.println("It is leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}

	}

}
