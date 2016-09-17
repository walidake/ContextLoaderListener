package com.walidake.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.walidake.service.UserService;

public class CommonListener implements ServletContextListener{

	private UserService userService;

	
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext());
		userService = context.getBean(UserService.class);
		servletContextEvent.getServletContext().setAttribute("list", userService.findUser());
		System.out.println(servletContextEvent.getServletContext().getAttribute("list"));
	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
