package org.example.autowiring;

public class Addresh {
    private  String addresh;


    public Addresh() {
    }

    @Override
    public String toString() {
        return "Addresh{" +
                "addresh='" + addresh + '\'' +
                '}';
    }

    public String getAddresh() {
        return addresh;
    }

    public void setAddresh(String addresh) {
        this.addresh = addresh;
    }
}
