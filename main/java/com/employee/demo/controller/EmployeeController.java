package com.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.addInfo(employeeEntity);
	}
	@GetMapping(value="/display")
	   public List<EmployeeEntity> getAll(){
		   return employeeService.getAll();
	   }
	@DeleteMapping(value="/delete/{empid}")
	   public String deleteId(@PathVariable  int empid) {
		   return employeeService.deleteId(empid);
	   }
	@PutMapping("/update/{empid}")
	   public EmployeeEntity updateInfo(@RequestBody EmployeeEntity employeeEntity,@PathVariable int empid)
	   {
		return employeeService.updateInfo(employeeEntity,empid);
		   
	   }
	
	@GetMapping("/getData/{empid}")
	public EmployeeEntity getInfo(@PathVariable  int empid) {
		return employeeService.getInfo( empid);
	}
	@PostMapping("/addBulkInfo")
	public List<EmployeeEntity> addBulkInfo(@RequestBody List<EmployeeEntity> employeeEntity) {
		return  employeeService.addBulkInfo(employeeEntity);
		 }
	@GetMapping(value="/getsalary/{from}/{to}")
	public List<EmployeeEntity> getSalaryRange(@PathVariable ("from") int salary1,@PathVariable ("to") int salary2){
		return employeeService.getSalaryRange(salary1,salary2);
	}
	@GetMapping(value="/gethighestsalary")
	public double getSalary(){
		return employeeService.getSalary();
	}
	@GetMapping(value="/getlowestsalary")
	public double getLowestSalary(){
		return employeeService.getLowestSalary();
	}
	@GetMapping(value="/getsalaryasce")
	public List<EmployeeEntity> getSalaryAsce(){
		return employeeService.getSalaryAsce();
	}
	@GetMapping(value="/getsalarydesc")
	public List<EmployeeEntity> getSalaryDesc(){
		return employeeService.getSalaryDesc();
	}
	@GetMapping(value="/getname")
	public List<EmployeeEntity> getNameWithEnding(){
		return employeeService.getNameWithEnding();
		
	}
	
}
