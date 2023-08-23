package com.withnotepad;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class WriteLogsEntryToLogFile {

	public static void main(String[] args) throws SecurityException, IOException {

		
		boolean append = true;
        FileHandler handler = new FileHandler("D:\\Automation and manual Documents\\default.log", append);
 
        Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
        logger.addHandler(handler);
         
        logger.severe("severe message");
 
  logger.warning("warning message");
 
  logger.info("info message");
 
  logger.config("config message");
 
  logger.fine("fine message");
 
  logger.finer("finer message");
 
  logger.finest("finest message");
	}

}
