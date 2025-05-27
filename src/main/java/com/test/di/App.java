package com.test.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("test-constructor-di.xml");
        Employee employee = (Employee)context.getBean("employee");
        Address address2 = (Address)context.getBean("address2");
        Addition addition = (Addition)context.getBean("addition");
        addition.sum();
        System.out.println(employee);
        System.out.println(address2);

    }
}
