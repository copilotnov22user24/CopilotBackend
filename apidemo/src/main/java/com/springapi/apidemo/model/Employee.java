package com.springapi.apidemo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//class employee with properties id, name, city, salary
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String city;
    private int salary;

    //constructor
    // public Employee(int id, String name, String city, int salary) {
    //     this.id = id;
    //     this.name = name;
    //     this.city = city;
    //     this.salary = salary;
    // }

    // //getters and setters
    // public int getId() {
    //     return id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public String getCity() {
    //     return city;
    // }

    // public int getSalary() {
    //     return salary;
    // }
}

