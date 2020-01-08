package com.cg.inheritance2;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TYPE1")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	public Employee(String ename)
	{
		super();
		this.ename=ename;
	}
	public Employee(){}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
