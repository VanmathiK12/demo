package com.kgisl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.demo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}