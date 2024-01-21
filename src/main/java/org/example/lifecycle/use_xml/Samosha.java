package org.example.lifecycle.use_xml;

public class Samosha {

    private  double price;


    public Samosha() {
    }

    public Samosha(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosha{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void initMethod()
    {
        System.out.println("Init Method..");
    }

    public void destroyeMethod()
    {
        System.out.println("destrpye Method");
    }
}
