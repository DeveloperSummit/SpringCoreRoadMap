package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/configuration.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

    }
}