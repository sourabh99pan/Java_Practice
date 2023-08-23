package com.interview.practice;

public class RemoveSpaceWithoutReplace {

	public static void main(String[] args) {
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er	vb";
		
		char [] cArr= str1.toCharArray();
		
		StringBuffer str2 = new StringBuffer();
		
		for(int i=0;i<cArr.length;i++)
		{
			if(!(cArr[i]==' '|| cArr[i]=='\t'))
			{
				str2.append(cArr[i]);
			}
		}
		
		System.out.println(str2);

	}

}
