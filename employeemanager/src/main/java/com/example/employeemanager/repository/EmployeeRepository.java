package com.example.employeemanager.repository;

import com.example.employeemanager.model.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

     void deleteEmployeeById(Long id);
     Optional<Employee> findEmployeeById(Long id);


}
