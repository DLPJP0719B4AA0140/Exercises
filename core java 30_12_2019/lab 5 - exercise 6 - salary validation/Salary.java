package com.cg.eis.exception;
import java.util.*;
public class Salary {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int salary;
		System.out.println("Enter salary of an employee:");
		salary=sc.nextInt();
		Validate v=new Validate(salary);
		v.getResult();
	}
}
