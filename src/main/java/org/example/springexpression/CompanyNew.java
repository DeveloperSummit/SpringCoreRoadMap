package org.example.springexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("Comp")
public class CompanyNew {
    @Override
    public String toString() {
        return "CompanyNew{" +
                "CompanyName='" + CompanyName + '\'' +
                ", number=" + number +
                ", status=" + status +
                '}';
    }

    @Value("HCL")
    private String CompanyName;

    @Value("3")
    private int number;


    //this is spring expression line we used for class
    // @Value("#{new java.lang.String("Anuj")}")

    //this line is used for the methid
   // @Value("#{T(java.lang.Math).sqrt(144)}")
    @Value("#{10>3?true:false}")
    private boolean status;
}
