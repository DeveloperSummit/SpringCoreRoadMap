package org.example.removexmlusingannotaion;

import org.example.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration
@ComponentScan(basePackages = "org.example.removexmlusingannotaion")
public class AnnotationMian {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AnnotationCOnfiguration.class);
     //   Juicer juicer=applicationContext.getBean("Abc",Juicer.class);
       // System.out.println("Juicer name ::==> "+juicer);


        /***
         * This below code is not working because of the @ComponnetScan not abel to scan the bean object becuase of the
         *
         * */

      /*AppleSheak appleSheak=applicationContext.getBean("rrrrrr",AppleSheak.class);
      appleSheak.study();*/

    }
}
