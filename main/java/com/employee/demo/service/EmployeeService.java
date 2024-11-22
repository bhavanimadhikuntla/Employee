package com.employee.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.dao.EmployeeDao;
import com.employee.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {
@Autowired
EmployeeDao employeeDao;
	public String addInfo( EmployeeEntity employeeEntity) {
		
		return employeeDao.addInfo(employeeEntity);
	}
	public List<EmployeeEntity> getAll() {
		return employeeDao.getAll();
	}
	public String deleteId(int empid) {
		return employeeDao.deleteId(empid);
	}
	public EmployeeEntity updateInfo(EmployeeEntity employeeEntity, int empid) {
		return employeeDao.updateInfo(employeeEntity,empid);
	}
	public EmployeeEntity getInfo(int empid) {
		return employeeDao.getInfo(empid);
	}
	public List<EmployeeEntity> addBulkInfo(List<EmployeeEntity> employeeEntity) {
		return employeeDao.addBulkInfo(employeeEntity);
	}
	public List<EmployeeEntity> getSalaryRange(int salary1, int salary2) {
		return employeeDao.getSalaryRange(salary1,salary2);
	}
	public double getSalary() {
		return employeeDao.getSalary();
	}
	public double getLowestSalary() {
		return employeeDao.getLowestSalary() ;
	}
	public List<EmployeeEntity> getSalaryAsce() {
		return employeeDao.getSalaryAsce() ;
	}
	public List<EmployeeEntity> getSalaryDesc() {
		return employeeDao.getSalaryDesc();
	}
	public List<EmployeeEntity> getNameWithEnding() {
		return employeeDao.getNameWithEnding();
	}
	

}
