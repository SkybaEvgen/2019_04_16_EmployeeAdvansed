package telran.enpl.entity;

import telran.enpl.stateconstant.StateConstans;

public class WaigeEmployee extends Employee {
	
	private int wage;

	public WaigeEmployee(int id, String firstName, String lastName, double hours, int wage) {
		super(id, firstName, lastName, hours);
		this.wage = wage;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "WaigeEmployee [wage=" + wage + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculateSalary() {
		double salary = super.getHours()*wage;
		if(salary<=super.getHours()*StateConstans.MIN_Wage){
			salary=super.getHours()*StateConstans.MIN_Wage;
			return salary;
		}
		return salary;
	}
	
	

}
