package com.example.microservice_crud_sinhvien.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
