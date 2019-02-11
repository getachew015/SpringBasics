package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 
  In case of non primitive type objects we can use Autowiring to achieve 
  dependency injection.
 */

public class ProductClient {
	
	public void productDetailAutowired(){
		//BTW the magic is happening in config.xml just fyi
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Product prod = (Product)context.getBean("productBean");
		ProductDetail prodDetail = (ProductDetail) context.getBean("productDetail");
		System.out.println("Product ID - "+prod.getProdId() +
				"\nQuantity - " + prod.getQuantity() +
				"\nUnit Price - " +prodDetail.getPrice() +
				"\nTotal Price - " + prodDetail.getPrice()*prod.getQuantity());
				((AbstractApplicationContext) context).close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductClient client = new ProductClient();
		client.productDetailAutowired();
	}

}
