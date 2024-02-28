package org.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private int studentId;
    private String studentName;
    private  String studentAddress;

    private List<Integer> list;
    private Map<Integer,String> mapValue;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", list=" + list +
                ", mapValue=" + mapValue +
                '}';
    }

    public Student(int studentId, String studentName, String studentAddress, List<Integer> list, Map<Integer, String> mapValue) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.list = list;
        this.mapValue = mapValue;
    }

    public Map<Integer, String> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<Integer, String> mapValue) {
        this.mapValue = mapValue;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public  void initMethod()
    {
        System.out.println("init --  Method");
    }


    public  void destroyMethod()
    {
        System.out.println("destroy --  Method");
    }

}
