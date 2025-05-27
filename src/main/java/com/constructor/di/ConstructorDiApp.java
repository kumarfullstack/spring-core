package com.constructor.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ConstructorDiApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("costructorDi.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);

        Addition addition = (Addition) context.getBean("addition");
        addition.sum();

    }
}
