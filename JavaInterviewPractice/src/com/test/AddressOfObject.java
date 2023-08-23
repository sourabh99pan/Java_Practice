package com.test;

public class AddressOfObject {
	

	public static void main(String[] args) {
		
		String str = "Hello";

		System.out.println("String address before concatenate "+str.hashCode());

		 str = str.concat("world");

		 System.out.println("String address after concatenate "+str.hashCode());


		StringBuffer str2 =new StringBuffer("This");

		System.out.println("String buffer address before append "+str2.hashCode());

		str2 = str2.append("is");

		System.out.println("String buffer address after append "+str2.hashCode());
		
		
		
	}

}
