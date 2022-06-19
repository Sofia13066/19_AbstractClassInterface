package controller;

import model.Employee;
import model.Manager;
import model.SalesManager;
import model.WageEmployee;

public class EmployeeAppl {

	public static void main(String[] args) {
		Employee[] firm = new Employee[5];
		firm[0] = new Manager(1000, "John", "Smith", 182, 20_000, 20);
		firm[1] = new WageEmployee(2000, "Mary", "Smith", 182, 40);
		firm[2] = new SalesManager(3000, "Peter", "Jackson", 182, 40_000, 0.1);
		firm[3] = new SalesManager(4000, "Tigran", "Petrosian", 91, 80_000, 0.1);
//		firm[4] = new Employee(-1, "A", "B", 200);
		printArray(firm);
		double total = totalSalary(firm);
		System.out.println("Total Salary: " + total);
	}

	private static double totalSalary(Employee[] firm) {
		double sum = 0;
		for (int i = 0; i < firm.length; i++) {
			if (firm[i] != null) {
				sum += firm[i].calcSalary();
			}
		}
		return sum;
	}

	private static void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.println(arr[i]);
			}		
		}
		
	}

}
