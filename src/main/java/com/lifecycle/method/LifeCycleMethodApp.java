package com.lifecycle.method;

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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life-cycle-method.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);

        EmployeeInterface employee2 = (EmployeeInterface) context.getBean("employee2");
        System.out.println(employee2);

        EmployeeAnnotation employee3 = (EmployeeAnnotation) context.getBean("employee3");
        System.out.println(employee3);

        context.registerShutdownHook();

    }
}
