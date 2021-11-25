package com.SpringRest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringRest.Model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	void delete(int id);

	Employee findOne(int id);
	
}
