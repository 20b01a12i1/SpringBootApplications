package com.example.demo.service;

import java.util.HashSet;

import com.example.demo.model.Student;

public interface StudentService {
	public HashSet<Student> getallStu();
	public void addStudent(Student st);
	public void deleteAll();
//	public void deleteStuid(String sid);
	public Student getStudent(String sid);

}
