package com.collection.practice;

//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface  
import java.util.*;  
import java.io.*;  
	class Student implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
	public int compareTo(Student st)
	{
		if(rollno==st.rollno)
			return 0;
		else if(rollno>st.rollno)
			return 1;
		else
			return -1;
	}
	
	public String getName() { 
		return name; 
		}
	}  
	//Creating a test class to sort the elements  
	public class TestSort3{  
	public static void main(String args[]){  
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
  
	Collections.sort(al);  
	for(Student st:al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age); 
	
	}  
 }  
}  
