package telran.enpl.entity;

import telran.enpl.stateconstant.StateConstans;

public class SalesManager extends Employee {
	
	private double salesValue;
	private double percent;
	
	public SalesManager(int id, String firstName, String lastName, double hours, double salesValue, double percent) {
		super(id, firstName, lastName, hours);
		this.salesValue = salesValue;
		this.percent = percent;
	}
	public double getSalesValue() {
		return salesValue;
	}
	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "SalesManager [salesValue=" + salesValue + ", percent=" + percent + ", toString()=" + super.toString() + "]";
	}
	@Override
	public double calculateSalary() {
		double salary=salesValue*percent;
		if(salary<=super.getHours()*StateConstans.MIN_Wage){
			salary=super.getHours()*StateConstans.MIN_Wage;
			return salary;
		}
		return salary;
	}
	
	

}
