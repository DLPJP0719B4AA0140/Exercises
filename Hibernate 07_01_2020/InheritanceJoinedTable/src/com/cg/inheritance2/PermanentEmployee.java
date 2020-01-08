package com.cg.inheritance2;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="eid")
public class PermanentEmployee extends Employee {
	
	private String subjectExpert;
	private int salary;
	public PermanentEmployee(String ename,String subjectExpert,int salary)
	{
		super(ename);
		this.subjectExpert=subjectExpert;
		this.salary=salary;
	}
	public PermanentEmployee(){super();}
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
