package com.collection.practice;
import java.lang.*;

 class Employee 
{
		int empid;  
		String name;  
		int age;  
	Employee(int empid,String name,int age)
	{
		this.empid=empid;
		this.name=name;
		this.age=age;
	}
	
	public String getName() { 
		return name; 
		}
	public int getID()
	{
		return empid;
	}
	
	public int getAge()
	{
		return age;
	}

}
