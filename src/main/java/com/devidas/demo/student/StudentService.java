package com.devidas.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        Student stu = new Student("ankit", 1234l, "test@gmail.com", LocalDate.of(1995, Month.APRIL,27),21);
        return List.of(stu);
    }
}
