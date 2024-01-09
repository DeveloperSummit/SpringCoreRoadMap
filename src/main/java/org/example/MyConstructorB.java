package org.example;

public class MyConstructorB {


    private  String mySecoundMemeber;




    public MyConstructorB() {
    }

    public MyConstructorB(String mySecoundMemeber) {
        this.mySecoundMemeber = mySecoundMemeber;
    }

    @Override
    public String toString() {
        return "MyConstructorB{" +
                "mySecoundMemeber='" + mySecoundMemeber + '\'' +
                '}';
    }
}
