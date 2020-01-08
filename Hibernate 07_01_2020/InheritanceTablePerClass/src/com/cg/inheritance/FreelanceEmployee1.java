package com.cg.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class FreelanceEmployee1 extends Employee {
	private String vendor;
	private int costPerDay;
	public FreelanceEmployee1()
	{}
	public FreelanceEmployee1(int eid,String ename,String vendor,int costPerDay)
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
