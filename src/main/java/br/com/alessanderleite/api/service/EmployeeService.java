package br.com.alessanderleite.api.service;

import java.util.List;

import br.com.alessanderleite.api.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
