package com.withnotepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("D:\\Automation and manual Documents\\MyTextFile.txt");
		
		 BufferedReader bufferedReader = new BufferedReader(reader); 
		 String line; 
		 while ((line = bufferedReader.readLine()) != null) { 
		 System.out.println(line); 
		 } 
		 reader.close();
		 
		 FileOutputStream outputStream = new FileOutputStream("D:\\Automation and manual Documents\\MyTextFile.txt"); 
		 OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16"); 
		 BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); 
		 bufferedWriter.append("in the logs");
		 bufferedWriter.newLine(); 
		 bufferedWriter.append("Garcia!"); 
		 bufferedWriter.newLine(); 
		 bufferedWriter.append("Hello World!"); 
		 bufferedWriter.close();
	}

}
