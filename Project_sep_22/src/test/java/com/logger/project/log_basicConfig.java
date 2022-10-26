package com.logger.project;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class log_basicConfig {
	
	public static Logger log = Logger.getLogger(log_basicConfig.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();
		
		log.debug("debug");
		log.info("information");
		log.warn("warning");
		log.error("error");
		log.fatal("fatel message");
	
		
	
		
	}

}
