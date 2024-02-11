package org.example.autowiring;

public class Student {

    private String studentName;
    private int studentRollNumber;
    private Addresh addresh;




    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", addresh=" + addresh +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public Addresh getAddresh() {
        return addresh;
    }

    public void setAddresh(Addresh addresh) {
        this.addresh = addresh;
    }
}
