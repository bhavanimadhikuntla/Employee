package com.employee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.demo.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
	@Query(value="select * from employee where salary>? and salary<?", nativeQuery=true)
	public List<EmployeeEntity> getSalaryRange(int salary1,int salary2);
	@Query(value="select max(salary) from employee ", nativeQuery=true)
	public double getSalary();
	@Query(value="select min(salary) from employee ", nativeQuery=true)
	public double getLowestSalary();
	@Query(value="select * from employee ORDER BY salary ASC",nativeQuery=true)
	public List<EmployeeEntity> getSalaryAsce();
	@Query(value="select * from employee ORDER BY salary DESC",nativeQuery=true)
	public List<EmployeeEntity> getSalaryDesc();
	@Query(value="select * from employee WHERE name LIKE ' %i_'",nativeQuery=true)
	public List<EmployeeEntity> getNameWithEnding();
	
} 
