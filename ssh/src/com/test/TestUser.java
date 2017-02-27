package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
  public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	User u=(User)ctx.getBean("user");
	System.out.println(u.getUsername());
	

}
}
