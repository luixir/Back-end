package com.bjtu.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextLoaderListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
		servletContext.setAttribute("ctx", servletContext.getContextPath());
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
