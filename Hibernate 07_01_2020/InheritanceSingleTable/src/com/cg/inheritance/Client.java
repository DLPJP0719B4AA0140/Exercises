
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
	      PermanentEmployee p1=new PermanentEmployee(1,"Kalpna","Web Technologies",45000);
	      PermanentEmployee p2=new PermanentEmployee(2,"Mamtha",".Net",60000);
	      
	      //Freelance Employee
	      FreelanceEmployee f1=new FreelanceEmployee(3,"Asha","UML-OOAD",40000);
	      FreelanceEmployee f2=new FreelanceEmployee(4,"Priya","JAVA",70000);
	      
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
