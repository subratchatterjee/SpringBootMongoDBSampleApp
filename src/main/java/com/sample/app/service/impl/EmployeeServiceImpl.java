package com.sample.app.service.impl;

import com.sample.app.model.Employee;
import com.sample.app.repository.EmployeeRepository;
import com.sample.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }
        return null;
    }
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
