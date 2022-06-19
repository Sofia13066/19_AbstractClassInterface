package tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.Company;
import dao.CompanyImpl;
import model.Employee;
import model.Manager;
import model.SalesManager;
import model.WageEmployee;

class CompanyTest {
	Company company;
	Employee[] firm;

	@BeforeEach
	void setUp() throws Exception {
		company = new CompanyImpl(5);
		firm = new Employee[4];
		firm[0] = new Manager(1000, "John", "Smith", 182, 20_000, 20);
		firm[1] = new WageEmployee(2000, "Mary", "Smith", 182, 40);
		firm[2] = new SalesManager(3000, "Peter", "Jackson", 182, 40_000, 0.1);
		firm[3] = new SalesManager(4000, "Tigran", "Petrosian", 91, 80_000, 0.1);
		for (int i = 0; i < firm.length; i++) {
			company.addEmployee(firm[i]);
		}
	}

	@Test
	void testAddEmployee() {
		assertFalse(company.addEmployee(firm[3]));
		Employee employee = new SalesManager(5000, "Peter", "Jackson", 182, 40_000, 0.1);
		assertTrue(company.addEmployee(employee));
		assertEquals(5, company.size());
		employee = new SalesManager(6000, "Peter", "Jackson", 182, 40_000, 0.1);
		assertFalse(company.addEmployee(employee));
	}

	@Test
	void testRemoveEmployee() {
		fail("Not yet implemented");
	}

	@Test
	void testFindEmployee() {
		assertTrue(company.findEmployee(firm[1]));
        assertFalse(company.findEmployee(firm[4]));
        
	}

	@Test
	void testTotalSalary() {
		fail("Not yet implemented");
	}

	@Test
	void testAverageSalary() {
		fail("Not yet implemented");
	}

	@Test
	void testTotalSales() {
		fail("Not yet implemented");
	}

	@Test
	void testSize() {
		assertEquals(4, company.size());
	}

	@Test
	void testPrintEmployees() {
		fail("Not yet implemented");
	}

}