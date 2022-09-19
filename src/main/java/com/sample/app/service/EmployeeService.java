package com.sample.app.service;

import com.sample.app.model.Employee;
import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee getEmployeeById(long id);

    List<Employee> getEmployees();

    void deleteEmployee(Long id);
}
