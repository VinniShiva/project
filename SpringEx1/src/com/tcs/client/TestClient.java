package com.tcs.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Test;

public class TestClient {

	public static void main(String[] args) {
 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
   System.out.println("shivatej");
      Test t = (Test)context.getBean("test");
        t.wish();
	}

}
