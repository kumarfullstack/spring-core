package com.stereotype.annotation;

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
                new ClassPathXmlApplicationContext("stereotypeAnnotation.xml");
        Employee employee =
                (Employee)context.getBean("employee");
        System.out.println(employee);
        employee.getEmpInfo();
    }
}
