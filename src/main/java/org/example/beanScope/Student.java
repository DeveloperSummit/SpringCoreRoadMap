package org.example.beanScope;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ABC")
//@Scope("prototype") by default it's using the Sigltone
public class Student {
    @Value("Anuj Singhsta")
    private String nameStudent;
    @Value("Eleven class")
    private String className;

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    @Value("#{2+3}")
    private int totalSum;


    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", className='" + className + '\'' +
                ", totalSum=" + totalSum +
                '}';
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
