package com.sample.app.controller;

import com.sample.app.model.Employee;
import com.sample.app.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author subrat.chatterjee
 */
@RestController
public class EmployeeController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee;
	}
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee;
	}
	@GetMapping(path = "/employees/{id}", produces = "application/json")
	public Employee getEmployee(@PathVariable String id) {
		LOG.info("getting employee with ID {}.", id);
		Employee employee = employeeService.getEmployeeById(Long.valueOf(id));
		return employee;
	}
	@GetMapping(path = "/employees", produces = "application/json")
	public List<Employee> getEmployee() {
		return employeeService.getEmployees();
	}
	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeByID(@PathVariable Long id) {
		LOG.info("deleting employee with id {}", id);
		employeeService.deleteEmployee(id);
	}
}
