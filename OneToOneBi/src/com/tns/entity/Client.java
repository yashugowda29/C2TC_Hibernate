package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Ishuu");
		
		Address homeaddress = new Address();
		homeaddress.setStreet("ABC");
		homeaddress.setCity("Bangalore");
		homeaddress.setState("Karnataka");
		homeaddress.setZipcode("560058");
		
		//Inject
		student.setAddress(homeaddress);
		
		Student student1 = new Student();
		student1.setName("Rashmi");
		
		Address homeaddress1 = new Address();
		homeaddress1.setStreet("XYZ");
		homeaddress1.setCity("Bangalore");
		homeaddress1.setState("Karnataka");
		homeaddress1.setZipcode("560058");
		
		student1.setAddress(homeaddress);
		
		em.persist(student);
		em.persist(student1);
		
		em.getTransaction().commit();
		
		System.out.println("Student data are added");
		
		em.close();
		factory.close();
		
	}
}