package org.example.autowiring.secoud_funda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCompany {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
         Company company=context.getBean("MyNameCOmapny",Company.class);
        System.out.println("My Company details "+company);
    }
}
