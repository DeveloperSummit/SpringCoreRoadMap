package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



    public static void main(String[] args) {


        

        String currency="";
        try {
            double localCurrency= Double.parseDouble(currency);
            if (localCurrency==0.0)
            {
                currency="";
                System.out.println("first"+currency);
            }else
            {
                System.out.println("Secound "+currency);
            }
        }catch (Exception e)
        {
            System.out.println(e);
           // e.printStackTrace();
            currency="HTY6YHRT";
        }
        System.out.println("###FINAL RESULT  "+currency);








        System.out.println("Hello world!");
        System.out.println("hi");

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