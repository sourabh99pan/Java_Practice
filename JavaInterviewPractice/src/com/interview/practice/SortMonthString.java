package com.interview.practice;

public class SortMonthString {

	public static void main(String[] args) {
		
		   String[] inputList = {
				      "Jan", "Feb", "Mar", "Apr", "May", "Jun",
				      "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
				    };
		   
		   for(int i=0;i<inputList.length;i++)
		   {
			   for(int j=i+1;j<inputList.length;j++)
			   {
				   if(inputList[i].charAt(0)>inputList[j].charAt(0))
				   {
					   String str=inputList[i];
					   inputList[i] = inputList[j];
					   inputList[j]=str;
					   //System.out.println(inputList[i].charAt(0));
					   //System.out.println(inputList[j].charAt(0));
				   }
					   else if(inputList[i].charAt(0)==inputList[j].charAt(0))
					   {
						   	if(inputList[i].charAt(1)>inputList[j].charAt(1))
						   	{
								   String str=inputList[i];
								   inputList[i] = inputList[j];
								   inputList[j]=str;
						   	 }
				   }
			   }
		   }
		   for(String s:inputList)
		   System.out.println(s);

	}

}
