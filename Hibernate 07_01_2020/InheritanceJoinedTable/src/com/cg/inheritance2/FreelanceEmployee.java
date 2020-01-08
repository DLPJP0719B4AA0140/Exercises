package com.cg.inheritance2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="eid")
public class FreelanceEmployee extends Employee {
	private String vendor;
	private int costPerDay;
	public FreelanceEmployee()
	{}
	public FreelanceEmployee(String ename,String vendor,int costPerDay)
	{
		super(ename);
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
