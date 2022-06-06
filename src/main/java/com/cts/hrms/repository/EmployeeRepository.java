package com.cts.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.hrms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
