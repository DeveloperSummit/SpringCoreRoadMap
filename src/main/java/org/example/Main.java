package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

       ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");

        /**
         * Below two line is used for the setter and list
         * this Student bean class object have the init and object method.
         * */
        Student student=context.getBean("student1",Student.class);
        System.out.println(student);


        ((ClassPathXmlApplicationContext) context).close();




        /**
         * Below two line is used for the Ref
         * */
        //   A student1 = context.getBean("aclass",A.class);
        //System.out.println(student1);


        /**
         * Below two line is used for the constructor
         * */

   //  MyConstructor myConstructor=   context.getBean("myconstructor",MyConstructor.class);
   //  System.out.println(myConstructor);






    }
}