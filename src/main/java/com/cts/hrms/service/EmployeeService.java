package com.cts.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.hrms.entity.Employee;
import com.cts.hrms.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee employee=null;
		if(temp.isPresent())
		{
			employee=temp.get();
		}
		return employee;
	}
	public Employee update(Employee employee) {
		Optional<Employee> temp = er.findById(employee.getId());
		Employee e=null;
		if(temp.isPresent())
		{
			e=temp.get();
			er.save(employee);			
		}
		return e;
	}
	public Employee delete(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee employee=null;
		if(temp.isPresent())
		{
			employee=temp.get();
			er.delete(employee);
		}
		return employee;
	}
	
}
