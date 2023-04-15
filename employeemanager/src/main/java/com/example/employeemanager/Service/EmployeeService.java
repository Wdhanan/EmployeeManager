package com.example.employeemanager.Service;

import com.example.employeemanager.Exceptions.UserNotFoundException;
import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepo;

    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);

    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);

    }
    public Employee findEmployeeById(Long id){

        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("the user with id:"+id+" was not found!"));

    }
    public void deleteEmployee(Long id){
         employeeRepo.deleteEmployeeById(id);

    }
}
