package com.rakesh.springboot.cruddemo.dao;

import com.rakesh.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { //<Enity and Primary Key>
}
