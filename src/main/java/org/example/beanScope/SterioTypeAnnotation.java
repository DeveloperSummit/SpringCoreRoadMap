package org.example.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SterioTypeAnnotation {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");

        Student myStudentInfo = context.getBean("ABC", Student.class);
        System.out.println("MyStduentValue ::"+myStudentInfo.hashCode());

        Student myStudentInfo1 = context.getBean("ABC", Student.class);
        System.out.println("MyStduentValue ::"+myStudentInfo1.hashCode());
    }
}
