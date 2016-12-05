package com.diegofdez.jettyserver;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupLoader implements ServletContextListener {
	final static Logger logger = Logger.getLogger(StartupLoader.class.getName());
	
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("Loader destroyed");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		logger.info("Loader initialized");

	}

}
