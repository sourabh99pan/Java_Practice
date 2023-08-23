package com.collection.practice;

import java.util.*;


public class EmployyIDCompare implements Comparator<Employee> {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new <Employee>ArrayList();
		emp.add(new Employee(10023,"Sourabh",24));
		emp.add(new Employee(10024,"David",27));
		emp.add(new Employee(10025,"Smith",34));

	    System.out.println("\nSorted by id");
	    EmployyIDCompare idCompare = new EmployyIDCompare();
	    Collections.sort(emp, idCompare);
	    for(Employee em:emp)
	    {
	    	System.out.println(em.empid+" "+em.name+" "+em.age); 
	    }
	}

	@Override
	public int compare(Employee d1, Employee d2) {
		// TODO Auto-generated method stub
		if(d1.empid==d2.empid)
			return 0;
		else if(d1.empid>d2.empid)
			return 1;
		else
			return -1;
			
	}

	}

