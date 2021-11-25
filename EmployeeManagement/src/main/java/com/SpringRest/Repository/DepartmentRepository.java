package com.SpringRest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringRest.Model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

	Department findOne(int id);

	void delete(int id);

}

