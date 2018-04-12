package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Component
public class ServletContextListenerImpl implements ServletContextListener {

    private static final Logger LOGGER= LoggerFactory.getLogger(ServletContextListenerImpl.class);
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		LOGGER.info("*** contextInitialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("*** contextDestroyed");
	}

}

