package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		//Create
		student.setStudentid(100);
		student.setName("Yashu");
		service.addStudent(student);
		System.out.println("Data is added");
		
		//Retrieve
		student = service.getStudentById(100);
		System.out.println("Id is " + student.getStudentid());
		System.out.println("Name is " + student.getName());
		
		//Update
		student = service.getStudentById(100);
		student.setName("Ishuu");
		service.updateStudent(student);
		System.out.println("Data is updated");
		
		//Delete
		student = service.getStudentById(100);
		service.removeStudent(student);
		System.out.println("Data is deleted");
	}
}
