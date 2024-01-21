package org.example.lifecycle.use_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("configlifecyle.xml");
        Samosha samosha= applicationContext.getBean("samosha",Samosha.class);
        System.out.println("Samosa Price "+samosha.getPrice());

        //this code is used for clean the code invoked the destroye method
        ((ClassPathXmlApplicationContext) applicationContext).close();


    }
}
