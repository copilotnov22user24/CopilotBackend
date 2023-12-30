// package com.springapi.apidemo.controller;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.springapi.apidemo.model.Employee;
// import com.springapi.apidemo.repository.EmployeeRepo;

// @RestController
// @RequestMapping("/api/v1")
// public class EmployeeController {

//     @Autowired
//     EmployeeRepo employeeRepo;

//     @GetMapping("/emp")
//     public List<Employee> getAllEmployees() {
//         Collection<Employee> employees = employeeRepo.getAllEmployees().values();
//         return new ArrayList<>(employees);
//     }
// }