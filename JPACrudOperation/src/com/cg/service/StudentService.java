package com.cg.service;

import com.cg.entity.Student;

public interface StudentService {
	
	public abstract void addStudent(Student student); //Create
	public abstract Student getStudentById(int id); //Retrieve
	public abstract void updateStudent(Student student); //Update
	public abstract void removeStudent(Student student); //Delete

}
