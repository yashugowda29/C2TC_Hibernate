package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Department d1 = new Department();
		d1.setId(10);
		d1.setName("C2TC");
		
		Department d2 = new Department();
		d2.setId(20);
		d2.setName("C2C");
		
		Employee e1 = new Employee();
		e1.setName("Lekha");
		e1.setSalary(5000.0f);
		
		Employee e2 = new Employee();
		e2.setName("Hitha");
		e2.setSalary(6000.0f);
		
		Employee e3 = new Employee();
		e3.setName("Shre");
		e3.setSalary(7000.0f);
		
		//Association
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		d2.addEmployee(e3);
		
		em.persist(d1);
		em.persist(d2);
		
		em.getTransaction().commit();
		
		System.out.println("Datas are added");
		
		em.close();
		factory.close();
		
	}
}
