package com.cg.jpastart.entities;

import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		//similar to create connection object 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		//similar to preparedstatement object
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("TANISHA");
		
		//to insert new record 
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
	}
}
