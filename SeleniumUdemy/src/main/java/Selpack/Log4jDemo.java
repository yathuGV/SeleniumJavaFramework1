package Selpack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println("\n Hello \n");
		
		logger.info("this is info");
		logger.error("this is error");
		logger.warn("this is warn");
		logger.fatal("this is fatal");
		
		System.out.println("\n  completed ");

	}

}
