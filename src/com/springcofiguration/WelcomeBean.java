package com.springcofiguration;

/*
Spring provides two types of containers
•	BeanFactory: It is a basic container available in Spring
	Resource res = new ClassPathResource("config.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	Object obj = factory.getBean("employee");
	(Doesn't support I18, Doesn't support annotation in Dependency Inj, Doesn't support Enterprise services like EJB, JNDI,
	By default it does Lazy Loading)
•	ApplicationContext: It is a special type of BeanFactory which has additional 
functionalities to support enterprise application development.
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	(Supports I18, Supports Annotation in Depency Inj, Supports enterprise services like EJB, JNDI
	, By default it does EAGER loading)
  
 */

public class WelcomeBean {
	//This is a POJO class that would be configured on 
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
