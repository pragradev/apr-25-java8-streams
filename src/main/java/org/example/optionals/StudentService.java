package org.example.optionals;

import java.util.Optional;

public class StudentService {
    StudentDAO dao = new StudentDAO();
    public void processStudentById(int id){
        Optional<Student> optionalStudent = dao.fetchStudentById(id);
        optionalStudent.ifPresent(System.out::println); // CAP theorm
        //Student student = optionalStudent.orElseGet(() -> new Student("Default"));
        Student student =optionalStudent.orElseThrow(() -> new RuntimeException("please enter valid ID"));
        System.out.println(student.getName());
//        if(optionalStudent.isPresent()){
//            Student student = optionalStudent.get()
//            System.out.println(student.getName());
//        }
    }
}
