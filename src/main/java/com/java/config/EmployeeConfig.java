package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.config")
public class EmployeeConfig {

//    @Bean()
//    @Bean("employee")
    @Bean({"employee","employee2","employee3"})
    public Employee getEmployee() {
        //object created by developer and handover to spring container
        return new Employee();
    }

}
