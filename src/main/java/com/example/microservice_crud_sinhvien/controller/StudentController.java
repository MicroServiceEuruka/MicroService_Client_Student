package com.example.microservice_crud_sinhvien.controller;

import com.example.microservice_crud_sinhvien.VO.ResponseTemplateVO;
import com.example.microservice_crud_sinhvien.entity.Student;
import com.example.microservice_crud_sinhvien.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") Long studentId){
        return studentService.getStudentWithDepartment(studentId);
    }
}
