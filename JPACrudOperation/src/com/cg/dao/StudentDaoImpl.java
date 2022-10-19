package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private EntityManager entityManager;
	
	public StudentDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);
	}
}
