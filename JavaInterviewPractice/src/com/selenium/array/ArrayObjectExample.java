package com.selenium.array;

import java.util.*;

class Student
{
	int id;
	String name;
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public  void display()
	{
		System.out.println(this.id+" "+this.name);

	}
}

public class ArrayObjectExample {

	public static void main(String[] args) {
		
		Student [] arr =new Student[3];
		
		arr[0]= new Student(1,"Sourabh");
		
		arr[0].display();
		
		arr[1] = new Student(2,"Virat");
		arr[1].display();
		arr[2] = new Student(3,"Dhoni");
		arr[2].display();

	}

}
