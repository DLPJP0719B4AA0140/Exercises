package com.cg.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class PermanentEmployee1 extends Employee {
	
	private String subjectExpert;
	private int salary;
	public PermanentEmployee1(int eid,String ename,String subjectExpert,int salary)
	{
		super(eid,ename);
		this.subjectExpert=subjectExpert;
		this.salary=salary;
	}
	public PermanentEmployee1(){super();}
	public String getSubjectExpert() {
		return subjectExpert;
	}
	public void setSubjectExpert(String subjectExpert) {
		this.subjectExpert = subjectExpert;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	};
	

}
