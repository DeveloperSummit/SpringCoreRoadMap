package org.example.lifecycle.use_interfece;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

    private double price;

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
    }

    public Pepsi(double price) {
        this.price = price;
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Destroy method invoked");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Init Method invoked");
    }
}
