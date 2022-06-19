package dao;

import model.Employee;

public class CompanyImpl implements Company{
	Employee[] employees;
	int size;
	
	public CompanyImpl(int capacity) {
		employees = new Employee[capacity];
	}

	@Override
	public boolean addEmployee(Employee employee) {
		for(int i = 0; i < employees.length; i++) {
            if(employees[i].getId() != employee.getId()){
                return true;
            }
            return false;
        }
		return true;
	}

	@Override
	public Employee removeEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

    int findIndex(int id) {
        for(int i = 0; i < size(); i++) {
            if(id == employees[i].getId()){
                return i;
            }
        }
        return -1;
    }

	@Override
	public Employee findEmployee(int id) {
		int index = findIndex(id);
        if(index >= 0) {
            return employees[index];
        }
        return null;
	}

	@Override
	public double totalSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double averageSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalSales() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void printEmployees() {
		// TODO Auto-generated method stub
		
	}

}
