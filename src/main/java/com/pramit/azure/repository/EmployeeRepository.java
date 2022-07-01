package com.pramit.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pramit.azure.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
