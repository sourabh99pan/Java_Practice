package com.collection.practice;

import java.util.*;


public class NameCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	public static void main(String args[]){  
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	
    System.out.println("\nSorted by name");
    NameCompare nameCompare = new NameCompare();
    Collections.sort(al, nameCompare);
    for(Student st:al)
    {
    	System.out.println(st.rollno+" "+st.name+" "+st.age); 
    }
    
    
	}
}
