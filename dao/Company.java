package dao;

import model.Employee;

public interface Company {
	
	boolean addEmployee(Employee employee);

	Employee removeEmployee(int id);

	Employee findEmployee(Employee firm);
	
	double totalSalary();
	
	double averageSalary();
	
	double totalSales();
	
	int size();
	
	void printEmployees();
}

