package com.lesson3;

import java.util.Arrays;

public class StudentApp {

	public static void main(String[] args) {
		Student []students=new Student[3];
		
		students[0]=new Student(101,"Gargesh","EEE");
		students[1]=new Student(123,"Uttam","IT");
		students[2]=new Student(161,"Neel","CS");
		
		System.out.println("====================");
		System.out.println("Student List Sorted By Name");
		Arrays.sort(students);
		for(int i=0;i<students.length;i++)
			System.out.println(students[i]);	
		
		System.out.println("====================");
		System.out.println("Student List Sorted By RollNo");
		
		CompareByRollNo r=new CompareByRollNo();
		
		Arrays.sort(students,r);
		
		for(int i=0;i<students.length;i++)
			System.out.println(students[i]);
		
		System.out.println("====================");
		System.out.println("Student List Sorted By Stream");
		
		CompareByStream s=new CompareByStream();
		
		Arrays.sort(students,s);
		
		for(int i=0;i<students.length;i++)
			System.out.println(students[i]);
		
		
		

	}

}
