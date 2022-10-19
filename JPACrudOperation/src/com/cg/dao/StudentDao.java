package com.cg.dao;

import com.cg.entity.Student;

public interface StudentDao {
	
	public abstract void addStudent(Student student); //Create
	public abstract Student getStudentById(int id); //Retrieve
	public abstract void updateStudent(Student student); //Update
	public abstract void removeStudent(Student student); //Delete

}
