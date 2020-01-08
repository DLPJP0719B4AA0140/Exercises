
package com.cg.inheritance;

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
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	public Employee(int eid,String ename)
	{
		super();
		this.eid=eid;
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
