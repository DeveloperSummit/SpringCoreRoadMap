package org.example;

public class MyConstructor {

    private  String EmpId;
    private String EmpName;

    private String EmpAddress;


    private MyConstructorB myConstructorB;

    public MyConstructor(String empId, String empName, String empAddress, MyConstructorB myConstructorB) {
        EmpId = empId;
        EmpName = empName;
        EmpAddress = empAddress;
        this.myConstructorB = myConstructorB;
    }

    public MyConstructor() {
    }

    @Override
    public String toString() {
        return "MyConstructor{" +
                "EmpId='" + EmpId + '\'' +
                ", EmpName='" + EmpName + '\'' +
                ", EmpAddress='" + EmpAddress + '\'' +
                ", myConstructorB=" + myConstructorB +
                '}';
    }

    public MyConstructor(String empId, String empName, String empAddress) {
        EmpId = empId;
        EmpName = empName;
        EmpAddress = empAddress;
    }
}
