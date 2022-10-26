package com.logger.project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_PropertyConfig {
	
	//Factory Design Pattern
	
	public static Logger log = Logger.getLogger(log_basicConfig.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("debugging");
		log.info("information");
		log.warn("warning");
		log.error("error message");
		log.fatal("Fatal message");
		
		
	}

}
