package com.cg.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="FE")
public class FreelanceEmployee extends Employee {
	private String vendor;
	private int costPerDay;
	
	public FreelanceEmployee()
	{}
	public FreelanceEmployee(int eid,String ename,String vendor,int costPerDay)
	{
		super(eid,ename);
		this.vendor=vendor;
		this.costPerDay=costPerDay;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}
}
