package org.example.studentkk.service;

import org.example.studentkk.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student createStudent(Student student);
    Student getStudentById(int id);
    Student updateStudent(Student student);
    void deleteStudent(int id);

}
