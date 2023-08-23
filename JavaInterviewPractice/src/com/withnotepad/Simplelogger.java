package com.withnotepad;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Simplelogger {

	public static void main(String[] args) throws SecurityException, IOException {

		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;
		
		  fh = new FileHandler("D:\\Automation and manual Documents\\Mylogs.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter); 
	        logger.info("My first log"); 
	        
	        logger.info("Hi How r u?");
	}

}
