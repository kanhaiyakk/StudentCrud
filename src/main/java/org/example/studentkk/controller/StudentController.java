package org.example.studentkk.controller;

import jakarta.persistence.Id;
import org.example.studentkk.entity.Student;
import org.example.studentkk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/create")
    ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student student1 = studentService.createStudent(student);
        return ResponseEntity.ok(student1);

    }

    @PostMapping("/update")
    ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student student1 = studentService.updateStudent(student);
        return ResponseEntity.ok(student1);
    }
    @GetMapping("/getStudent")
    ResponseEntity<Student> readStudent(@RequestParam("id") Integer id) {
        System.out.println(id);
       Student student1 = studentService.getStudentById(id);
        System.out.println(student1);
       return new  ResponseEntity<>(student1, HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    ResponseEntity<Student> deleteStudent(@RequestParam("id") Integer id) {
         studentService.deleteStudent(id);
         return new ResponseEntity<>(HttpStatus.OK);
    }

}
