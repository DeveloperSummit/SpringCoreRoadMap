package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.println("Text");
        String ss=null;
        String hhhh=ss;
        String result = Objects.toString(null, "jj");
        System.out.println(hhhh+"check data "+result);
        if (result.equals("y"))
        //{
            System.out.println("fine");
        System.out.println("test");
        /*}else
        {
            System.out.println("wrong");
        }*/


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
    private static void printFirstElement(String[] array) throws NullPointerException {
        System.out.println(array[0]);
    }

}