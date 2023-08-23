package com.collection.practice;

import java.util.*;

public class EmpNameCompare implements Comparator<Employee>{
	

	public static void main(String[] args) {
		

		ArrayList<Employee> emp = new <Employee>ArrayList();
		emp.add(new Employee(10023,"Sourabh",24));
		emp.add(new Employee(10024,"David",27));
		emp.add(new Employee(10025,"Smith",34));

	    System.out.println("\nSorted by name");
	    EmpNameCompare nameCompare = new EmpNameCompare();
	    Collections.sort(emp, nameCompare);
	    for(Employee em:emp)
	    {
	    	System.out.println(em.empid+" "+em.name+" "+em.age); 
	    }
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.getName().compareTo(o2.getName());
		return o1.getName().compareTo(o2.getName());
	}


}
