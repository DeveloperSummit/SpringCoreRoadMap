package org.example.removexmlusingannotaion;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



//I am comment this annotation becuase of I am using the @bean annotation in the configuration class
//@Component("jusier")
public class Juicer {
    public String getJuicerName() {
        return juicerName;
    }

    public void setJuicerName(String juicerName) {
        this.juicerName = juicerName;
    }

    @Override
    public String toString() {
        return "Juicer{" +
                "juicerName='" + juicerName + '\'' +
                '}';
    }


    //first prioiry value after set method invoked if you want to invoke the method
   // @Value("Apple juice")
    private String juicerName;

}
