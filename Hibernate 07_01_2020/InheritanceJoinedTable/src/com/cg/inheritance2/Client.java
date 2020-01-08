package com.cg.inheritance2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-PU" );
	      EntityManager em = emfactory.createEntityManager( );
	      em.getTransaction( ).begin( );
	      
	      //Permanent Employee
	      PermanentEmployee p1=new PermanentEmployee("Kalpna","Web Technologies",45000);
	      PermanentEmployee p2=new PermanentEmployee("Mamtha",".Net",60000);
	      
	      //Freelance Employee
	      FreelanceEmployee f1=new FreelanceEmployee("Asha","UML-OOAD",40000);
	      FreelanceEmployee f2=new FreelanceEmployee("Priya","JAVA",70000);
	      
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
