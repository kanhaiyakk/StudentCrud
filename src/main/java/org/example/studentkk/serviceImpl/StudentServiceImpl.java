package org.example.studentkk.serviceImpl;

import org.example.studentkk.entity.Student;
import org.example.studentkk.repository.StudentRepository;
import org.example.studentkk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student createStudent(Student student) {
        try {
            Student save = studentRepository.save(student);
            return save;

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        try {


            Student student = studentRepository.findById(id).get();
            if (student == null) {
                throw  new Exception("Student not found");
            }
            return student;

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        try {
            Student save = studentRepository.save(student);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteStudent(int id) {
        try {
            boolean b = studentRepository.existsById(id);
            if (b) {
                studentRepository.deleteById(id);
            }
            else {
                throw  new Exception("student id not found");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }
}
