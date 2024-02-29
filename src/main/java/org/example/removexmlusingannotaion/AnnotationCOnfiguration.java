package org.example.removexmlusingannotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/***below line I have comment this line because of the I am not using the @Compopnent annotation and
// No need to scan the pacakaege because of the I have created the object in config class using the @bean annotation
//if you are using the @bean annotation no need to used the @componenet & @componenetscan annoattioion becaese we crae the bean(Object) in the config class and this class used the @Configuration
@ComponentScan(basePackages = "org.example.removexmlusingannotaion")*/

public class AnnotationCOnfiguration {

   @Bean("Abc")
    public Juicer getJusier()
    {
        Juicer juicer=new Juicer();
        juicer.setJuicerName("Banana sheak");
        return juicer;
    }

}
