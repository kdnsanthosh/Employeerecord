package com.dummy.Employeerecord.EmployeeController;


import com.dummy.Employeerecord.Entity.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John ", "Software Engineer", "john.doe@Gmail.com"));
        employees.add(new Employee(2, "Jane", "Product Manager", "jane.smith@Gmail.com"));
        employees.add(new Employee(3, "Johnson", "Designer", "alice.johnson@Gmail.com"));
        employees.add(new Employee(4, "Sam", "Software Engineer", "Sam@Gmail.com"));
        employees.add(new Employee(5, "Ravi", "Product Manager", "Ravi@Gmail.com"));
        employees.add(new Employee(6, "Simsim", "Designer", "Simsim@Gmail.com"));
        employees.add(new Employee(7, "Hunt", "Software Engineer", "Hunt.doe@Gmail.com"));
        employees.add(new Employee(8, "Senthil", "Product Manager", "Senthil.smith@Gmail.com"));
        employees.add(new Employee(9, "Guna", "Designer", "Guna@Gmail.com"));
        employees.add(new Employee(10, "Anbu", "Software Engineer", "Anbu.doe@Gmail.com"));
        return employees;
    }

    
}
