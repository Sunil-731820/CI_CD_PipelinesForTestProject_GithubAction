package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // You can add custom query methods if needed, e.g.:
    // List<Employee> findByDepartment(String department);
}
