package com.example.microservice_crud_sinhvien.service;

import com.example.microservice_crud_sinhvien.VO.Department;
import com.example.microservice_crud_sinhvien.VO.ResponseTemplateVO;
import com.example.microservice_crud_sinhvien.entity.Student;
import com.example.microservice_crud_sinhvien.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public ResponseTemplateVO getStudentWithDepartment(Long studentId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student student= studentRepository.findById(studentId).get();
        vo.setStudent(student);
        Department department=
                restTemplate.getForObject("http://localhost:9001/departments/"
                        + student.getDepartmentId(),Department.class);
        vo.setDepartment(department);
        return vo;
    }

}
