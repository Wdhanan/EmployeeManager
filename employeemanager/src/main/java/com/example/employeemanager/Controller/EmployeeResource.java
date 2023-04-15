package com.example.employeemanager.Controller;

import com.example.employeemanager.Service.EmployeeService;
import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Cors Configuration für Cross Origin
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/find/{id}")

    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);

    }
    @PostMapping ("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee myemployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(myemployee, HttpStatus.CREATED);

    }
    @CrossOrigin("http://localhost:4200/")
    @PutMapping ("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee myemployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(myemployee, HttpStatus.OK);

    }
    // Cors Configuration für Cross Origin
    @CrossOrigin("http://localhost:4200/")
    @DeleteMapping (path = "/delete/{id}")
    @Transactional// transactional is necessary fort PUT and DELETE
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(  HttpStatus.OK);

    }
}
