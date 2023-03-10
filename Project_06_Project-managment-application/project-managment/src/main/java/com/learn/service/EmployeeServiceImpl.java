package com.learn.service;

import com.learn.dao.EmployeeDaoImpl;
import com.learn.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDaoImpl.getAllEmployee();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDaoImpl.saveEmployee(employee);
    }

    @Override
    public Employee upldateEmployee(Employee employee) {
        return employeeDaoImpl.upldateEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(long empId) {
        employeeDaoImpl.deleteEmployeeById(empId);

    }
}
