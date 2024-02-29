package org.example.springexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSpression {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
        CompanyNew companyNew=context.getBean("Comp",CompanyNew.class);
        System.out.println(" darta" +companyNew);
    }

}
