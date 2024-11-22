package com.employee.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.repository.EmployeeRepo;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepo employeeRepo;
	public String addInfo( EmployeeEntity employeeEntity) {
	    employeeRepo.save(employeeEntity);
		return "Data Added to DB Successfully";
	}
	public List<EmployeeEntity> getAll() {
		return employeeRepo.findAll();
	}
	public String deleteId(int empid) {
		employeeRepo.deleteById(empid);
		return "Data Deleted Successfully";
	}
	public EmployeeEntity updateInfo(EmployeeEntity employeeEntity, int empid) {
		EmployeeEntity emps=employeeRepo.findById(empid).get();
		emps.setName(employeeEntity.getName());
		emps.setSalary(employeeEntity.getSalary());
		return employeeRepo.save(emps);
	}
	public EmployeeEntity getInfo(int empid) {
		return employeeRepo.findById(empid).get();
	}
	public List<EmployeeEntity> addBulkInfo(List<EmployeeEntity> employeeEntity) {
		return employeeRepo.saveAll(employeeEntity);
	}
	public List<EmployeeEntity> getSalaryRange(int salary1, int salary2) {
		return employeeRepo.getSalaryRange(salary1,salary2);
	}
	public double getSalary() {
		return employeeRepo.getSalary();
	}
	public double getLowestSalary() {
		return employeeRepo.getLowestSalary() ;
	}
	public List<EmployeeEntity> getSalaryAsce() {
		return employeeRepo.getSalaryAsce();
	}
	public List<EmployeeEntity> getSalaryDesc() {
		return employeeRepo.getSalaryDesc();
	}
	public List<EmployeeEntity> getNameWithEnding() {
		return employeeRepo.getNameWithEnding();
	}
	

}
