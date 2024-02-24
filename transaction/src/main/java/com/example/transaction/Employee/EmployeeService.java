package com.example.transaction.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired EmployeeRepository employeeRepository;

    @Autowired AddressService addressService;

    @Transactional
    public Employee addEmployee(Employee employee) throws Exception{
        Employee newEmployee =  this.employeeRepository.save(employee);

        Address address = null;
        address.setId(123);
        address.setAddress("Gokul Road");
        address.setEmployee(newEmployee);
        this.addressService.addAddress(address);
        return newEmployee;
    }
}
