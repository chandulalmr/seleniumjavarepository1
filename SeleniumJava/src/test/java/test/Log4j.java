package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	// we need to make this static because we are referring it in static method
	private static Logger loggerobj = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		System.out.println("Hi");

		loggerobj.trace("This is Trace");
		loggerobj.info("This is information");
		loggerobj.error("This is a error");
		loggerobj.warn("This is a Warn");
		loggerobj.fatal("This is a Fatal");

		System.out.println("Completed");
	}


}
