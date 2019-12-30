package com.cg.eis.exception;

public class Validate {
	int salary;
	Validate(int salary){
		this.salary=salary;
	}
	public void getResult(){
		try {
			if(salary<3000){
				throw new EmployeeException();
			}
			else{
				System.out.println("Salary is valid.\nProgram Terminated");
			}
		} catch (EmployeeException e) {
			System.out.println(e);
		}
	}
}
