package org.example;

public class B {

    private int y;

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B(int y) {
        this.y = y;
    }
}
