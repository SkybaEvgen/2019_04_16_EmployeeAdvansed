package telran.enpl.dao;

import telran.enpl.entity.Employee;

public class Company {
	
	private Employee[] employees;
	private int companySize;
	
	public Company(int capacity){
		employees=new Employee[capacity];
		companySize=0;
	}

	public boolean addEmployee(Employee employee){
		if(companySize<employees.length){
			employees[companySize]=employee;
			companySize++;
			return true;
		}
		return false;
	}
	
	public boolean removeEmployee(Employee employee){
		for (int i = 0; i < companySize; i++) {
			if(employees[i].equals(employee)){
				employees[i]=employees[companySize-1];
				companySize--;
				return true;
			}
		}
		return false;
	}
	
	public double minSalary(){
		double min = employees[0].calculateSalary();
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()<min){
				min=employees[i].calculateSalary();
			}
		}
		return min;
	}
	
	public double maxSalary(){
		double max = employees[0].calculateSalary();
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()>max){
				max=employees[i].calculateSalary();
			}
		}
		return max;
	}
		
	public double sumSalary(){
		double sum=0;
		for (int i = 0; i < companySize; i++) {
			sum=sum+employees[i].calculateSalary();
		}
		return sum;
	}
	
	
	public Employee employeeMinSalary(){
		Employee min = employees[0];
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()<min.calculateSalary()){
				min=employees[i];
			}
		}
		return min;
	}
	
	public Employee[] poorMens(int num){		//метод, который определяет самых бедных сотрудников (колличество num людей)
		double minSalary=this.minSalary();
		Employee[] min = new Employee[num];     //создали массив для самых бедных сотрудников (массив размером num)
		int size = 0;
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()==minSalary && size<num){
				min[size]=employees[i];
				size++;
			}
		}
		return min;
	}
	
	public void display(){
		for (int i = 0; i < companySize; i++) {
			employees[i].showtax();
		}
	}
	
	public void display (Employee[] employee){			//метод, который отображает одного человека
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employees[i]);
		}
		
	}
	
	
}
