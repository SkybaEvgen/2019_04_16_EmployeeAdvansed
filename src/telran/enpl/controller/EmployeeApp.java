package telran.enpl.controller;

import telran.enpl.dao.Company;
import telran.enpl.entity.SalesManager;
import telran.enpl.entity.WaigeEmployee;

public class EmployeeApp {

	public static void main(String[] args) {
	
		Company c1 = new Company(10);
		SalesManager sm1 = new SalesManager(777, "Vas", "Pes", 50, 200000, 0.1);
		SalesManager sm2 = new SalesManager(777, "Rrr", "Pes", 50, 200, 0.1);
		SalesManager sm3 = new SalesManager(777, "Ppp", "Pes", 50, 150000, 0.1);
		
		WaigeEmployee we1 = new WaigeEmployee(888, "Per", "Kul", 80, 9);
		WaigeEmployee we2 = new WaigeEmployee(858, "Ru", "Kul", 80, 9);
		WaigeEmployee we3 = new WaigeEmployee(128, "Mar", "Kul", 80, 9);
		WaigeEmployee we4 = new WaigeEmployee(788, "Mar", "Kul", 80, 9);
		WaigeEmployee we5 = new WaigeEmployee(488, "Mar", "Kul", 80, 9);
		WaigeEmployee we6 = new WaigeEmployee(388, "Mar", "Kul", 80, 9);
		
		c1.addEmployee(sm1);
		c1.addEmployee(sm2);
		c1.addEmployee(sm3);
		c1.addEmployee(we1);
		c1.addEmployee(we2);
		c1.addEmployee(we3);
		c1.addEmployee(we4);
		c1.addEmployee(we5);
		c1.addEmployee(we6);
		
		System.out.println(sm1.calculateSalary());
		System.out.println(sm1.calculateTax());
		sm1.showtax();
//		System.out.println("~~~~~~~~~~~~~~~1~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Min Salary " + c1.minSalary());
		System.out.println("Max Salary " + c1.maxSalary());
		System.out.println("FOT "+c1.sumSalary());
		System.out.println(c1.employeeMinSalary());
		System.out.println("~~~~~~~~~~~~~~~~~~2~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(c1.poorMens(3));
		c1.display(c1.poorMens(4));
	}

}
