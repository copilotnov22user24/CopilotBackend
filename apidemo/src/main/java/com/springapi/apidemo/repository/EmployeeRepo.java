package com.springapi.apidemo.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springapi.apidemo.model.Employee;

@Repository
public class EmployeeRepo {

  static HashMap<Integer, Employee> empRepo = new HashMap<>();
  static {
    empRepo.put(1, new Employee(1, "John", "London", 2000));
    empRepo.put(2, new Employee(2, "David", "New York", 3000));
    empRepo.put(3, new Employee(3, "Smith", "Paris", 4000));
  }

  public Map<Integer, Employee> getAllEmployees() {
    return empRepo;
  }

public Object getEmployeeById(int getId) {
    return empRepo.get(getId);
}
}
