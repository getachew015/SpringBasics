package com.springcofiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CllientLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiating using the two types of Spring provided containers
		String message1 = "Welcome to Spring Using BeanFactory Container...";
		Resource res = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		WelcomeBean welcome = (WelcomeBean)factory.getBean("welcomeBean");
		welcome.setMessage(message1);
		System.out.println(welcome.getMessage());

		//Instantiating using ApplicationContext
		String message2 = "Welcome to Spring Using ApplicationContext container...";
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		WelcomeBean welcome2 = (WelcomeBean)context.getBean("welcomeBean");
		welcome2.setMessage(message2);
		System.out.println(welcome2.getMessage());
		
	}

}
