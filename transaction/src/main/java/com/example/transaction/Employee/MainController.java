package com.example.transaction.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class MainController {

    @Autowired private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> add(@RequestBody Employee employee) throws Exception {
        Employee newEmp = this.employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(newEmp, HttpStatus.CREATED);
    }
}
