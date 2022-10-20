package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		dao.BeginTransaction();
		dao.addStudent(student);
		dao.CommitTransaction();
	}

	@Override
	public Student getStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		dao.BeginTransaction();
		dao.updateStudent(student);
		dao.CommitTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		dao.BeginTransaction();
		dao.removeStudent(student);
		dao.CommitTransaction();
	}
}
