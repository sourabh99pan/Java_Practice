package com.interview.practice;
import java.util.*;

public class PercentageofCharsinString {
	

	public static void main(String[] args) {
		
		String str ="Tiger Runs @ The Speed Of 100 km/hour";
		int small=0;
		int capital=0;
		int digit=0;
		int special=0;
		
		char c[] = str.toCharArray();
		
		int size = c.length;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				small++;
			}
			else if(c[i]>='A' && c[i]<='Z')
			{
				capital++;
			}
			else if(c[i]>='0' && c[i]<='9')
			{
				digit++;
			}

			else
			{
				special++;
			}
		}
		
		double smallPerc = (small*100.0)/size;
		double capitalPerc = (capital*100.0)/size;
		double digitPerc = (digit*100.0)/size;
		double specialPerc = (special*100.0)/size;
		System.out.println("small char % "+smallPerc);
		System.out.println("capital char % "+capitalPerc);
		System.out.println("digit char % "+digitPerc);
		System.out.println("special char % "+specialPerc);
		
		

	}

}
