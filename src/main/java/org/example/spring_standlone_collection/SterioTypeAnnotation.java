package org.example.spring_standlone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SterioTypeAnnotation {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
        Student myStudentInfo = context.getBean("xxxx", Student.class);
        System.out.println("MyStduentValue ::"+myStudentInfo);
    }
}
