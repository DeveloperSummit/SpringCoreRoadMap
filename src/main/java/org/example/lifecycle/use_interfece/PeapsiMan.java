package org.example.lifecycle.use_interfece;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeapsiMan {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("configlifecyle.xml");
        Pepsi pepsi= applicationContext.getBean("p1",Pepsi.class);
        System.out.println("Pepsi Price In India "+ pepsi.getPrice());

        ((ClassPathXmlApplicationContext) applicationContext).close();

    }
}
