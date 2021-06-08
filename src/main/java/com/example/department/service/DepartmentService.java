package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Md. Liton Miah
 * @Date 6/6/2021
 */

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("Inside getDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
