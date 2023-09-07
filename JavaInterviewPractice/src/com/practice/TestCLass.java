package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class TestCLass {

	public static void main(String[] args) {

		String org = "nitin";
		String rev = "";
		boolean flag=true;
		
		for(int i=0;i<org.length()/2;i++)
		{
			if(org.charAt(i)==org.charAt(org.length()-i-1))
			{
				continue;
			}
			else
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("it is palindrom");
		}
		else
		{
			System.out.println("it is not palindrom");
		}
		
	}	
	}


