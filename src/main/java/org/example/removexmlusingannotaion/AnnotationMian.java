package org.example.removexmlusingannotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMian {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AnnotationCOnfiguration.class);
        Juicer juicer=applicationContext.getBean("Abc",Juicer.class);
        System.out.println("Juicer name ::==> "+juicer);

    }
}
