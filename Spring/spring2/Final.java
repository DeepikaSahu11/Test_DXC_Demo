package com.org.emp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Final{
   public static void main(String[] args) {
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

      Patient p = (Patient) context.getBean("patient");
      p.calculate();
      context.close();
   }
}