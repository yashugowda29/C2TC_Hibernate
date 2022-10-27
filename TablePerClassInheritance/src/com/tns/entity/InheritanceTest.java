package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create One Employee
		Employee employee = new Employee();
		employee.setName("Yashu");
		employee.setSalary(5000);
		em.persist(employee);
		
		//Create One Manager
		Manager manager = new Manager();
		manager.setName("Rukmini");
		manager.setSalary(10000);
		manager.setDepartmentName("Technical Training");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and one manager data");
		
		em.close();
		factory.close();
		
	}
}