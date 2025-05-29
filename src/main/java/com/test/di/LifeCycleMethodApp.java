package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class LifeCycleMethodApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);

        EmployeeLifeCycleInterface employee2 =
                (EmployeeLifeCycleInterface)context.getBean("employee2");
        System.out.println(employee2);

        EmployeeLifeCycleAnnotation employee3 =
                (EmployeeLifeCycleAnnotation)context.getBean("employee3");
        System.out.println(employee3);
        context.registerShutdownHook();

    }
}
