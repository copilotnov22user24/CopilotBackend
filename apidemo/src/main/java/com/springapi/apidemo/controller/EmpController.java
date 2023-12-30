package com.springapi.apidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.springapi.apidemo.repository.EmployeeRepo;

@RestController
public class EmpController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/emp")
    Object getEmp() {
        return employeeRepo.getAllEmployees();
    }

    @GetMapping("/empbyid")
    Object getEmpById(@RequestParam int id) {
        return employeeRepo.getEmployeeById(id);
    }
}
