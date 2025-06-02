package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollection.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);

        Employee employee2 = (Employee)context.getBean("employee2");
        System.out.println("employee2 : " + employee2);
    }
}
