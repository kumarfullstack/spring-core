package com.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
                new AnnotationConfigApplicationContext(EmployeeConfig.class);
        /*Employee employee =
                (Employee)context.getBean("employee");
        System.out.println(employee);*/

        Employee employee =
                (Employee)context.getBean("employee3");
        System.out.println(employee);
    }
}
