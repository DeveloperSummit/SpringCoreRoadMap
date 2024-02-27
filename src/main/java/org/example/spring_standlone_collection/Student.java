package org.example.spring_standlone_collection;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyStudentInfo {

    @Value("Anuj Singhsta")
    private String nameStudent;
    @Value("Eleven class")
    private String className;
}
