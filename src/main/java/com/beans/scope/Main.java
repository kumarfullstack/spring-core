package com.beans.scope;

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
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beansScope.xml");

        Employee employee =
                (Employee)context.getBean("employee");
        System.out.println(employee.hashCode());

        Employee employee2 =
                (Employee)context.getBean("employee");
        System.out.println(employee2.hashCode());
        System.out.println(employee.equals(employee2));
    }
}
