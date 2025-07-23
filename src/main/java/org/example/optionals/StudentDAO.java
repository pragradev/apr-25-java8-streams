package org.example.optionals;

import java.util.Optional;

public class StudentDAO {
    public Optional<Student> fetchStudentById(int id){
        // send query to databse
        Student student;
        if (id == 500){
            student = new Student("Sunny");
        }else {
            student = null;
        }
        Optional<Student> optionalStudent = Optional.ofNullable(student);
        return optionalStudent;
    }
}
