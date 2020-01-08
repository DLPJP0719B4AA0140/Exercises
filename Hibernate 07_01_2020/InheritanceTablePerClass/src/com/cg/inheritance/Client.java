package com.cg.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-PU" );
	      EntityManager em = emfactory.createEntityManager( );
	      em.getTransaction( ).begin( );
	      
	      //Permanent Employee
	      PermanentEmployee1 p1=new PermanentEmployee1(11,"Kokila","Web Technologies",45000);
	      PermanentEmployee1 p2=new PermanentEmployee1(22,"Meghna",".Net",60000);
	      
	      //Freelance Employee
	      FreelanceEmployee1 f1=new FreelanceEmployee1(33,"Reshma","UML-OOAD",40000);
	      FreelanceEmployee1 f2=new FreelanceEmployee1(44,"Riya","JAVA",70000);
	      
	      em.persist(p1);
	      em.persist(p2);
	      
	      em.persist(f1);
	      em.persist(f2);
	      
	      System.out.println("Data Persisted...");
	      em.getTransaction().commit();
	      em.close();
	      emfactory.close();
	      
	      

	}

}
