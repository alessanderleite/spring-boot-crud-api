package br.com.alessanderleite.api.dao;

import java.util.List;

import br.com.alessanderleite.api.model.Employee;

public interface EmployeeDAO {

	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
