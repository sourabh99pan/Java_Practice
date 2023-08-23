package com.practice;

import java.util.Scanner;

public class ATM {
	
	
	int balance =  100000;
	int  newbalance=0;
	
	public  void withdraw(int amt)
	{
	
	if(newbalance==0)
	{
	newbalance = balance-amt;
	}
	else
	{
		newbalance = newbalance-amt;
	}
}
	
	public void deposit(int amt)
	{
		if(newbalance==0)
		{
		newbalance = balance+amt;
		}
		else
		{
			newbalance = newbalance+amt;
		}
	}
	
	public void balance()
	{
		System.out.println("Your balance is: "+newbalance);
	}
	
	
	public static void main(String[] args) {
		
		ATM obj =new ATM();
		
		System.out.println("Select option for your banking");
		
		System.out.println("1 for withdraw");
		System.out.println("2 for deposit");
		System.out.println("3 for balance");
		System.out.println("4 for exit");
		
		Scanner sc = new Scanner(System.in);
		
		
		int option = sc.nextInt();
		
		while(option!=4)
		{
		
		if(option==1)
		{
			System.out.println("Please enter amount to withdraw");
			
			Scanner sc1 = new Scanner(System.in);
			
			int amountwithdraw = sc1.nextInt();
			
			obj.withdraw(amountwithdraw);
			
			System.out.println(amountwithdraw+" has been withdrawed");
			option = sc.nextInt();
			
		}
		
		if(option==2)
		{
			System.out.println("Please enter amount to deposit");
			
			Scanner sc1 = new Scanner(System.in);
			
			int amountdep = sc1.nextInt();
			
			obj.deposit(amountdep);
			
			System.out.println(amountdep+" has been deposit");
			option = sc.nextInt();
		}
		
		if(option==3)
		{
			
			obj.balance();
			option = sc.nextInt();
		}

		}
		
		System.out.println("Thanks for choosing our bank");
		
	}

}
